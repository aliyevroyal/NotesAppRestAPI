# Note Management CRUD Backend

This is the backend part of the Notes CRUD application, built using Java and Spring Boot. The backend provides RESTful API endpoints to manage notes data, including creating, reading, updating, and deleting notes records.

## Technologies Used

- Java
- Spring Boot
- MySQL Database

## Prerequisites

Before running the backend, ensure you have the following installed:

- Java Development Kit (JDK)
- IDE (e.g., IntelliJ IDEA, Visual Studio Code)
- Git

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/aliyevroyal/NotesAppRestAPI
   ```

2. Navigate to the backend directory.

3. Run the Java application

The backend will be running at `http://localhost:8080`.

## API Endpoints

- Create Note: `POST /api/createNote`
- Get All Notes: `GET /api/readNotes`
- Get Note by ID: `GET /api/notes/{id}`
- Update Note: `PUT /api/notes`
- Delete Note: `DELETE /api/notes/{id}`

## Database

The application uses a MySQL database for demonstration purposes. You can configure a different database in the `application.properties` file in the backend directory.

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.

## Acknowledgments

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Java](https://www.java.com/en/)

## Contact

If you have any questions or feedback, please contact [Royal Aliyev](mailto:royal.alyv@gmail.com).
