FROM openjdk:24-slim
WORKDIR /app
COPY target/MAProjectUserServices-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
