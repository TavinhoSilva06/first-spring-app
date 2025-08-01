FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY . .

RUN chmod +x mvnw
RUN ./mvnw clean package
RUN mv target/*SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
