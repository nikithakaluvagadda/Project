FROM java:8
ARG java_file=target/hotel-service.jar
WORKDIR /opt/app
EXPOSE 6565
COPY ${java_file} app.jar
ENTRYPOINT ["java", "-jar","app.jar"]