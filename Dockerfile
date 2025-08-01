FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package
ENTRYPOINT ["java", "-jar", "/app.jar"]