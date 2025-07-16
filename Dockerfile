# Use a base image with Java (e.g., OpenJDK)
FROM eclipse-temurin:17-jre

# Copy the built jar from your local machine into the image
COPY target/timeout.poc-0.0.1-SNAPSHOT.jar /app/app.jar

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "/app/app.jar"]