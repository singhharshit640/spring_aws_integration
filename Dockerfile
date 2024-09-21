# Use the official OpenJDK 17 base image (non-alpine)
FROM openjdk:17-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the Maven build output (the JAR file) into the container
COPY target/springaws-0.0.1-SNAPSHOT.jar /app/demo.jar

# Expose port 8080
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "demo.jar"]