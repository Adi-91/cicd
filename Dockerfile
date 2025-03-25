FROM openjdk:17-jdk-slim

# Simply the artifact path
COPY ./target/spring-boot-web.jar  .

RUN chmod +x ./spring-boot-web.jar

ENTRYPOINT ["java","-jar","spring-boot-web.jar"]