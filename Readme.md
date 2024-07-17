## Wish list
This project utilizes Gradle as the build system, Java Spring Boot for the backend, and Angular for the frontend. The application focuses on providing a web interface for users to manage their wishlists.

## Project Structure
El proyecto se organiza de la siguiente manera:

### Backend
#### Authentication
##### Arquitecture
```
src
|-- main
|   |-- java
|       |-- com
|           |-- yourcompany
|               |-- yourproject
|                   |-- application
|                       |-- UserApplicationService.java
|                   |-- domain
|                       |-- model
|                           |-- User.java
|                       |-- repository
|                           |-- UserRepository.java
|                       |-- service
|                           |-- UserService.java
|                   |-- infrastructure
|                       |-- adapter
|                           |-- UserController.java
|                           |-- UserRepositoryAdapter.java
|                       |-- configuration
|                           |-- ApplicationConfig.java
|                   |-- Application.java
|-- resources
|   |-- application.properties`
```

### Frontend

## Database Configuration
The necessary data for database creation is located in the data.sql file. To facilitate automatic creation, the project has been configured with the following properties in `application.properties`:
```properties
spring.jpa.hibernate.ddl-auto=update
spring.datasource.initialization-mode=always
```
If the database does not get created automatically, you can change the `spring.jpa.hibernate.ddl-auto` property to `create`, comment out the line `spring.datasource.initialization-mode=always`, compile the project, and then revert it to `update` to start its execution..

### Version Configuration
This project was built with the following versions:

- Java: 17.0.8
- Gradle: 7.3
- Angular: 13.0.2

### Project execution
#### Backend (Spring Boot)
Make sure you have Java 17 and Gradle 7.3 installed. From the root folder of the project, execute the following command to start the backend:

```bash
gradle bootRun
```

This command will build the project and run the Spring Boot application, starting the backend server.

#### Frontend (Angular)
Make sure you have Node.js and npm installed. Navigate to the frontend folder from the project root and execute the following commands:
```bash
npm install
npm run start
```
With these steps, you should be able to run both the backend and frontend of your Wishlist project. Enjoy developing!

### Additional notes
- Make sure you have the necessary dependencies specified in the `build.gradle` file.
- This project uses Gradle as the build system, so ensure you have it installed.

With this structure and setup, you should be ready to start your Wishlist project using Java Spring Boot and Angular. Good luck!