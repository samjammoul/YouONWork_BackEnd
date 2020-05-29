FROM openjdk:11
ADD target/YouOnWork.jar YouOnWork.jar
ENTRYPOINT ["java","-jar","/YouOnWork.jar"]

