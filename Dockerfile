FROM openjdk:8
ADD target/simplehellodockerserver2-0.0.1-SNAPSHOT.jar simplehellodockerserver2-0.0.1-SNAPSHOT.jar.jar
EXPOSE 4042
ENTRYPOINT ["java","-jar","simplehellodockerserver2-0.0.1-SNAPSHOT.jar.jar"]