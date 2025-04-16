# Use a minimal OpenJDK base image
FROM openjdk:17-jdk-slim

# Set working directory in container
WORKDIR /app

# Copy WAR file from target folder into container
COPY target/group-project-0.0.1-SNAPSHOT.war app.war

# Expose the port the app runs on
EXPOSE 8080

# Run the WAR file
ENTRYPOINT ["java", "-jar", "app.war"]
