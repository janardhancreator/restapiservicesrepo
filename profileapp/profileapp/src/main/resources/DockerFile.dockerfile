# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from your local machine to the Docker container
COPY profileapp/target/profileapp-0.0.1-SNAPSHOT.jar.original /app/profileapp.jar

# Expose the port that the Spring Boot application will run on (default is 8080)
EXPOSE 8080

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "/app/profileapp.jar"]

# Optional: Add a healthcheck to ensure the app is running properly
# HEALTHCHECK --interval=30s --timeout=5s --retries=3 CMD curl --fail http://localhost:8080/actuator/health || exit 1
