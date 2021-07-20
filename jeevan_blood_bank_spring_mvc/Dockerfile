FROM java:8
ARG java_file=target/jeevan-bloodbank-service.war
WORKDIR /opt/app
EXPOSE 4040
COPY ${java_file} app.jar
ENTRYPOINT ["java", "-jar","app.jar"]