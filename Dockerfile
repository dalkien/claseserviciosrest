FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/claseserviciosrest-0.0.1-SNAPSHOT.jar claseserviciosrest.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /claseserviciosrest.jar" ]
EXPOSE 8080/tcp