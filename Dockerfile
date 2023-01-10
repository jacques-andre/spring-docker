FROM openjdk:11 AS builder
WORKDIR /build

COPY . .
RUN ./mvnw package

FROM openjdk:11
WORKDIR /app
COPY --from=builder /build/target/demo-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
