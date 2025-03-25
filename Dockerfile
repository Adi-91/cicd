# You can change this base image to anything else
# But make sure to use the correct version of Java
FROM openjdk:17-jdk-slim

# Simply the artifact path
WORKDIR /opt/app

COPY ./target/spring-boot-web.jar /opt/app

# This should not be changed
ENTRYPOINT ["java","-jar","spring-boot-web.jar"]
