FROM openjdk:latest

WORKDIR /usr/app

COPY build/template-project-1.0-SNAPSHOT.jar /usr/app/

RUN sh -c 'touch template-project-1.0-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","template-project-1.0-SNAPSHOT.jar"]
