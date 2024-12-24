# SpringBoot-Prometheus-Grafana 

## Overview
This project demonstrates a simple CRUD (Create, Read, Update, Delete) application using Spring Boot and MariaDB. Additionally, the application integrates Prometheus for monitoring and uses Spring Boot Actuator for health checks and insights.

## Dependencies
The following dependencies are used in this project:

- **Spring Web**: For building REST APIs.
- **Spring Boot Actuator**: To monitor and manage the application.
- **Spring Data JPA**: For ORM functionality.
- **Spring Boot DevTools**: For faster application development.
- **Prometheus**: For collecting metrics.
- **MariaDB Driver**: For connecting to the MariaDB database.

## Setup

### application.properties
Below is the configuration used in the `application.properties` file:

```properties
spring.application.name=Springboot-Grafana-Prometheus
spring.datasource.url=jdbc:mariadb://localhost:3306/grafana
spring.datasource.username=root
spring.datasource.password=priyanka
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update

management.endpoints.web.exposure.include=*
management.endpoint.health.show-details=always
```

### Database Configuration
Ensure that MariaDB is installed and running on your local machine. Create a database named `grafana` using the following SQL command:

```sql
CREATE DATABASE grafana;
```

Update the username and password in the `application.properties` file as per your MariaDB configuration.

## Application Components

### Classes

#### 1. Teacher
This entity represents a `Teacher` with necessary fields and annotations for persistence.

#### 2. TeacherController
The REST controller that handles CRUD operations for the `Teacher` entity.

#### 3. TeacherRepository
The repository interface that extends `JpaRepository` to provide database interaction for `Teacher` entities.

## Running the Application
1. Clone the repository.
2. Import the project into your IDE.
3. Add the necessary dependencies in the `pom.xml` or `build.gradle`.
4. Run the application using the `main` method in the Spring Boot application class.

## Monitoring

- **Actuator**: Access the Actuator endpoints for application health and metrics.
- **Prometheus**: Integrate with Prometheus to visualize the collected metrics. Ensure Prometheus is configured to scrape data from this application.

