FROM openjdk:17
EXPOSE 9093
ADD target/spring_student_docker.jar spring_student_docker.jar
ENTRYPOINT ["java","-jar","/spring_student_docker.jar"]