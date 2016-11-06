#FROM frolvlad/alpine-oraclejdk8:slim
FROM jack/alpine_jre:8
VOLUME /tmp
ADD usersvc-1.0.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
