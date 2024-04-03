FROM openjdk:17-alpine
EXPOSE 8085
ADD target/*.jar devops_spring_boot.jar
ENTRYPOINT ["java", "-jar", "/devops_spring_boot.jar"]
