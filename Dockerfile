FROM eclipse-temurin:21-jdk

LABEL authors="felipelafin"

WORKDIR /app

COPY target/backend-restaurante-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 3000

ENTRYPOINT ["java", "-jar", "app.jar"]