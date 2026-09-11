FROM gradle:8.5-jdk21 AS build

WORKDIR /app

COPY . .

RUN ./gradlew clean bootJar --no-daemon

FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /app/build/libs/tasty-api-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 3000

ENTRYPOINT ["java", "-jar", "app.jar"]