FROM openjdk:latest
COPY ./target/Group3-1.0-SNAPSHOT-jar-with-dependencies.jar /tmp
WORKDIR /tmp
#ENTRYPOINT ["java", "-jar", "Group3-1.0-SNAPSHOT-jar-with-dependencies.jar"]
ENTRYPOINT ["java", "-jar", "Group3-1.0-SNAPSHOT-jar-with-dependencies.jar", "db:3306", "30000"]