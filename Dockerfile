FROM openjdk:17-jdk-slim

# Simply the artifact path

WORKDIR /opt/app

COPY target/spring-boot-web.jar app.jar

RUN chmod +x /opt/app/app.jar

# This should not be changed
ENTRYPOINT ["java","-jar","app.jar"]