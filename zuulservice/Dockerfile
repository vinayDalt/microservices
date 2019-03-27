FROM openjdk:11.0-jdk
ADD ./target/zuulservice-0.0.1-SNAPSHOT.jar /muzix/app/zuulservice-0.0.1-SNAPSHOT.jar
WORKDIR muzix/app
ENTRYPOINT ["java", "-jar", "zuulservice-0.0.1-SNAPSHOT.jar"]