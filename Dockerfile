FROM adoptopenjdk:11-jre-hotspot

ARG JAR_FILE=./target/restaurant_application_backend_v1-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} application.jar

EXPOSE 5000

ENTRYPOINT ["java", "-jar", "application.jar"]	