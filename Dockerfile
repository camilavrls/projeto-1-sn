FROM openjdk:11-jdk-slim

WORKDIR /app

RUN apt-get update && apt-get install -y maven

COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY . .

RUN mvn clean package -DskipTests

ARG JAR_FILE=target/demo-1.0.0.jar

EXPOSE 8080

CMD ["java", "-jar", "target/demo-1.0.0.jar"]