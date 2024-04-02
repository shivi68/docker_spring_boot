FROM openjdk:17-alpine
EXPOSE 8085
ADD target/devops_spring_boot.jar devops_spring_boot.jar
ENTRYPOINT ["java", "-jar", "/devops_spring_boot.jar"]