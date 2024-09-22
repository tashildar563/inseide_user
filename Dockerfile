# Use the official OpenJDK base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the host machine to the container
COPY build/libs/inside_user-0.0.1-SNAPSHOT.jar /app/inside_user-0.0.1-SNAPSHOT.jar

# Expose the port your application runs on
EXPOSE 8001

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "/app/inside_user-0.0.1-SNAPSHOT.jar"]