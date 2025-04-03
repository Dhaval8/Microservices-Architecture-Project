FROM openjdk:23-jdk-slim
WORKDIR /app
COPY target/MAAPIGateway-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 9000
ENTRYPOINT ["java", "-jar", "/app/app.jar"]