FROM openjdk:17
ENV MONGO_DB_USERNAME=username \
    MONGO_DB_PWD=password
COPY  target/user-service.jar user-service.jar
ENTRYPOINT ["java","-jar","/user-service.jar"]