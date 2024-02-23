FROM maven:latest
EXPOSE 8080
WORKDIR /app
COPY pom.xml /app/
COPY . /app/
RUN mvn package
CMD ["java", "-jar", "target/apptotestjenkins.jar"]

#Remember the Dockerfile name should be as it is written here
#Docker file must be at the root of your project
# We have the EXPOSE for jenkins which i cover the following week.

#PUT EXTRA ATTENTION TO THE SPACE USED IN THE DOCKFILE TAGS, I GOT
#ERROR BECAUSE I HAVENOT ADD SPACE BETWEEN . and / in COPY