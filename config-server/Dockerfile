FROM openjdk:24-slim
WORKDIR /app
COPY target/config-server-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
