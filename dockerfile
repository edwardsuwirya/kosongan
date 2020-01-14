FROM openjdk:8-jdk-alpine
ENV PORT=8282
COPY target/kosongan-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
