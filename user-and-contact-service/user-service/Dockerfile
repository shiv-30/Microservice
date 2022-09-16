FROM openjdk:16
EXPOSE 9010
WORKDIR /app

# Copy maven executable to the image
COPY mvnw .
COPY .mvn .mvn

# Copy the pom.xml file
COPY pom.xml .

# Copy the project source
COPY ./src ./src
COPY ./pom.xml ./pom.xml

#Copy the target file
COPY ./target ./target

RUN chmod 755 /app/mvnw

RUN ls -al
ENTRYPOINT ["java","-jar","target/user-service-0.0.1-SNAPSHOT.jar"]