# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY CloudComputing_jar CloudComputing
EXPOSE 8080
CMD ["java", "-jar", "CloudComputing/CloudComputing.jar"]