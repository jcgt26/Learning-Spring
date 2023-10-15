FROM openjdk:17-alpine
VOLUME /tmp
ARG JAR_FILE
ADD build/libs/*.jar /app.jar
EXPOSE 8080
LABEL authors="juancamiloguzmantoro"
ENTRYPOINT ["java", "-jar", "/app.jar"]