FROM openjdk:11
MAINTAINER Lazaro Jr
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]