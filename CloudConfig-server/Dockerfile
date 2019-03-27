FROM openjdk:11.0-jdk
ADD ./target/CloudConfig-0.0.1-SNAPSHOT.jar /muzix/app/CloudConfig-0.0.1-SNAPSHOT.jar
WORKDIR muzix/app
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "CloudConfig-0.0.1-SNAPSHOT.jar"]