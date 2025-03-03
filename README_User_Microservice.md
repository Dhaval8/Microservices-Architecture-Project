# User Micro Service

## Description
The **User Micro Service** is a Spring Boot-based microservice designed to manage user-related operations. It provides RESTful APIs for handling user entities within a system.

## Features
- CRUD (Create, Read, Update, Delete) operations for users.
- REST API built with Spring Boot.
- Uses Maven for dependency management.

## Technologies Used
- **Java** (Spring Boot Framework)
- **Maven** (Dependency Management)
- **Spring Data JPA** (For Database Interaction)
- **H2 / MySQL** (Database)
- **Spring Boot Actuator** (For Monitoring)

## Installation

### Prerequisites
- Install [Java 17+](https://adoptopenjdk.net/)
- Install [Maven](https://maven.apache.org/)

### Steps to Run
1. Clone the repository:
   ```sh
   git clone <repository-url>
   cd MAProjectUserServices
   ```
2. Build the project:
   ```sh
   mvn clean install
   ```
3. Run the Spring Boot application:
   ```sh
   mvn spring-boot:run
   ```

## API Endpoints
| Method | Endpoint | Description |
|--------|---------|------------|
| GET | `/users` | Get all users |
| GET | `/users/{id}` | Get user by ID |
| POST | `/users` | Create a new user |
| PUT | `/users/{id}` | Update a user |
| DELETE | `/users/{id}` | Delete a user |

## Configuration
Modify `application.properties` to change database settings.

## License
This project is licensed under the MIT License.
