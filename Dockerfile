FROM openjdk:17-alpine

WORKDIR /app
ADD /back-ws/target/Application-server-ws.jar app.jar


# Define environment variables
ENV BDD_USER_PASSWORD=password \
    BDD_USER=user \
    BDD_URL=jdbc:postgresql://localhost:5432/swarm \
    FRONT_SERVICE_URL=http://localhost:3000 \
    BACK_SERVICE_URL=http://localhost:8080 \
    BACK_SERVICE_PORT=8080

EXPOSE 8080
CMD ["java","-jar","/app/app.jar"]
