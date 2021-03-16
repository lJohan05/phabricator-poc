FROM openjdk:8-jdk-alpine
EXPOSE 3000
ADD build/libs/*.jar app.jar
CMD ["java", "-jar", "/app.jar"]