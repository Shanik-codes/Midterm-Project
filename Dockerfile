# Use an official OpenJDK runtime as a parent image
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the host to the container
COPY target/helloworld-1.0-SNAPSHOT.jar myapp.jar

# Run the application
ENTRYPOINT ["java", "-jar", "myapp.jar"]