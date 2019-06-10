FROM openjdk:11.0.3-jdk-slim-stretch
ADD ./target/spring-boot-0.0.1-SNAPSHOT.jar /app/music/spring-boot-0.0.1-SNAPSHOT.jar
WORKDIR app/music
ENTRYPOINT ["java","-jar","spring-boot-0.0.1-SNAPSHOT.jar"]
