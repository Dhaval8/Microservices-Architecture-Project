# Owner Micro Service

## Description
The **Owner Micro Service** is a Spring Boot-based microservice that manages owner-related operations. It provides RESTful APIs for handling owner entities in a system.

## Features
- Create, Read, Update, and Delete (CRUD) operations for owners.
- REST API built using Spring Boot.
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
   cd MAProjectOwnerServices
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
| GET | `/owners` | Get all owners |
| GET | `/owners/{id}` | Get owner by ID |
| POST | `/owners` | Create a new owner |
| PUT | `/owners/{id}` | Update an owner |
| DELETE | `/owners/{id}` | Delete an owner |

## Configuration
Modify `application.properties` to change database settings.

## License
This project is licensed under the MIT License.
