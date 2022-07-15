#FROM adoptopenjdk/openjdk11:alpine
#FROM openjdk:8-alpine
FROM openjdk:11-jre-slim
WORKDIR /app
#RUN add group -S spring && adduser -S spring -G spring
#USER spring:spring
ARG JAR_FILE
ADD ${JAR_FILE} /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]