From openjdk:11
ADD target/*.jar test.jar
CMD ["java","-jar","test.jar"]
