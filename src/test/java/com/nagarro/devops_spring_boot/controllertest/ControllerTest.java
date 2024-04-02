package com.nagarro.devops_spring_boot.controllertest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetMessage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/welcome")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("This is DevOps Assignment!!"));
    }

    @Test
    public void testGetMessage2() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/Assignment2")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("In Assignment 2-A) U have to create a Jenkins freestyle project to download code from the GitHub."));
    }

    @Test
    public void testGetMessage3() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/Assignment3")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("In Assignment 3-A) U have to create a freestyle Jenkins pipeline to build and deploy the Spring Boot Application using Docker."));
    }
   
}
