FROM openjdk:22-jdk

WORKDIR /app

COPY target/cicdpipeline-0.0.1-SNAPSHOT.jar /app/cicddemo.jar

EXPOSE 8080

CMD ["java", "-jar", "cicddemo.jar"]