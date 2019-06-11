FROM openjdk:11.0.3-jdk-slim-stretch
ADD ./target/springboot-configserver-service-0.0.1-SNAPSHOT.jar /app/music/springboot-configserver-service-0.0.1-SNAPSHOT.jar
WORKDIR app/music
ENTRYPOINT ["java","-jar","springboot-configserver-service-0.0.1-SNAPSHOT.jar"]
