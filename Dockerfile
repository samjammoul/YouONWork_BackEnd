FROM openjdk:11
ADD target/YouOnWork.jar YouOnWork.jar
ENTRYPOINT ["java","-Dspring.profiles.active=pro","-jar","/YouOnWork.jar"]

