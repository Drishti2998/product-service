FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/product-service.jar product-service.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar", "product-service.jar"]
