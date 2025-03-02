# Use an official OpenJDK runtime as a parent image
FROM openjdk:11

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the host to the container
COPY target/myapp.jar myapp.jar

# Run the application
ENTRYPOINT ["java", "-jar", "myapp.jar"]