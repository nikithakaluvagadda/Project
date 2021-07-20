FROM java:8
ARG java_file=target/maven-service.jar
WORKDIR /opt/app
COPY ${java_file} app.jar
ENTRYPOINT ["java", "-jar","app.jar"]