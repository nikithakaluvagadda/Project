FROM java:8
ARG java_file=target/mobile-service.jar
WORKDIR /opt/app
EXPOSE 9091
COPY ${java_file} app.jar
ENTRYPOINT ["java", "-jar","app.jar"]