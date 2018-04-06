ecom-application ![Build Status]
-----


This project provides productive setup for building Spring Boot Angular applications. The application is divided into two Maven modules:

1. `backend-services`: This contains Java code of the application.
2. `frontend-services`: This contains source code for the Angular based frontend.

This project uses following versions:

1. Spring Boot v1.5.9
2. Angular v5.0.4
3. Node v8.9.0
4. Yarn v1.3.2

## Running the full application

You can build the package as a single artifact by running the `./mvnw clean install`.
Next, you can run the application by executing:

```bash
$ java -jar backend-services/target/ecom-app.jar
```

The application will be accessible at `http://localhost:8080`.

## Features

