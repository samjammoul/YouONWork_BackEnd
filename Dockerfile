FROM openjdk:11
ADD target/YouOnWork-0.0.1-SNAPSHOT.jar YouOnWork-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/YouOnWork-0.0.1-SNAPSHOT.jar"]
