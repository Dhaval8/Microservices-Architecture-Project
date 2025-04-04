FROM openjdk:24-alpine
WORKDIR /app
COPY target/MAEureka-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
