FROM openjdk:11.0-jdk
ADD ./target/track-0.0.1-SNAPSHOT.jar /muzix/app/track-0.0.1-SNAPSHOT.jar
WORKDIR muzix/app
ENTRYPOINT ["java", "-jar", "track-0.0.1-SNAPSHOT.jar"]