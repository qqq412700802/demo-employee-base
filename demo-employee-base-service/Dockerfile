FROM openjdk
COPY ./target/*.jar /opt
WORKDIR /opt
EXPOSE 8080

CMD ["/bin/sh", "-c", "java -jar *.jar"]