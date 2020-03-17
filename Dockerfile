FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} youonworkapi.jar
ENTRYPOINT ["java","-jar","/youonworkapi.jar"]
