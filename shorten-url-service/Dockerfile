FROM maven:3.6.3 AS maven
LABEL MAINTAINER="htyesilyurt@gmail.com"

WORKDIR /opt/shorten-url-service
COPY . /opt/shorten-url-service
RUN mvn clean install 

# For Java 11, 
FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=shorten-url-service.jar

WORKDIR /opt/shorten-url-service

COPY --from=maven /opt/shorten-url-service/target/${JAR_FILE} /opt/shorten-url-service/

ENTRYPOINT ["java","-jar","shorten-url-service.jar"]