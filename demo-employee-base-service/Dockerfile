FROM harbor.sitir.net/devops/openjdk:14.0.1-jdk
COPY ./target/*.jar /opt
WORKDIR /opt
EXPOSE 8080

CMD ["/bin/sh", "-c", "java -jar *.jar"]