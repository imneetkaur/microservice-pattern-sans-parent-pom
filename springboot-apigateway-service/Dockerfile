FROM openjdk:11.0.3-jdk-slim-stretch
ADD ./target/springboot-apigateway-service-0.0.1-SNAPSHOT.jar /app/music/springboot-apigateway-service-0.0.1-SNAPSHOT.jar
WORKDIR app/music
ENTRYPOINT ["java","-jar","springboot-apigateway-service-0.0.1-SNAPSHOT.jar"]
