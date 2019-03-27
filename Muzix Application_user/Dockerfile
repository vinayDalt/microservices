FROM openjdk:11.0-jdk
ADD ./target/user-0.0.1-SNAPSHOT.jar /muzix/app/user-0.0.1-SNAPSHOT.jar
WORKDIR muzix/app
ENTRYPOINT ["java", "-jar", "user-0.0.1-SNAPSHOT.jar"]

