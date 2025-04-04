FROM openjdk:24-alpine
WORKDIR /app
COPY target/VehicleKilometerTracking-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
