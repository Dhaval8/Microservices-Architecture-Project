FROM openjdk:24-slim
WORKDIR /app
COPY target/MAProjectBookingServices-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
