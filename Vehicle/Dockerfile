FROM openjdk:23-jdk-slim
WORKDIR /app
COPY target/Vehicle-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
