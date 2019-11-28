FROM java:8
VOLUME /tmp
ADD /target/springboot-docker.jar springboot-docker.jar
RUN bash -c 'touch /springboot-docker.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Xms512m", "-Xmx2048m", "-Dfile.encoding=utf-8","-Dsun.jnu.encoding=UTF8","-jar","/springboot-docker.jar"]