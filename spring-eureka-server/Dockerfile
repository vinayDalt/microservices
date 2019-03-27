FROM openjdk:11.0-jdk
ADD ./target/spring-eureka-server-0.0.1-SNAPSHOT.jar /muzix/app/spring-eureka-server-0.0.1-SNAPSHOT.jar
WORKDIR muzix/app
EXPOSE 9091
ENTRYPOINT ["java", "-jar", "spring-eureka-server-0.0.1-SNAPSHOT.jar"]