FROM openjdk:8-jdk-alpine3.7
COPY ./target/player_demo-0.1.0.jar /home/app.jar
CMD ["java","-jar","/home/app.jar"]
