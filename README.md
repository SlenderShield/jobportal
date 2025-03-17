# Job Portal

A modern, web-based job portal application built using **Java**, **Spring Boot**, and **Spring MVC**. This project allows employers to post job listings and job seekers to browse and apply for jobs. It provides a user-friendly interface and a robust backend to manage job postings, applications, and user accounts.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features
- User authentication and authorization (Employer and Job Seeker roles)
- Job posting creation, editing, and deletion by employers
- Job search and filtering functionality for job seekers
- Application submission and tracking
- Responsive UI for desktop and mobile devices
- RESTful API endpoints for job and user management

## Technologies Used
- **Java**: Core programming language (version 17 recommended)
- **Spring Boot**: Framework for building the application
- **Spring MVC**: For handling web requests and responses
- **Spring Data JPA**: For database interactions
- **Hibernate**: ORM for mapping Java objects to database tables
- **MySQL**: Relational database (can be swapped with other databases)
- **Thymeleaf**: Templating engine for server-side rendering
- **Maven**: Dependency management and build tool
- **HTML/CSS/JavaScript**: Frontend technologies
- **Git**: Version control

## Prerequisites
Before running the application, ensure you have the following installed:
- Java Development Kit (JDK) 17 or higher
- Maven 3.6+
- MySQL (or your preferred database)
- Git
- An IDE like IntelliJ IDEA or Eclipse (optional but recommended)

## Installation
1. **Clone the repository**:
   ```bash
   git clone https://github.com/slendershield/job-portal.git
   cd jobportal
   ```

2. **Set up the database**:
   - Create a MySQL database (e.g., `job_portal_db`).
   - Update the database configuration in `src/main/resources/application.properties` (see [Configuration](#configuration)).

3. **Install dependencies**:
   Run the following command to download all required Maven dependencies:
   ```bash
   mvn clean install
   ```

## Configuration
Edit the `application.properties` file located in `src/main/resources/` with your database credentials and other settings:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/job_portal_db
spring.datasource.username=jobportal
spring.datasource.password=jobportal
spring.jpa.hibernate.ddl-auto=update
spring.thymeleaf.cache=false
server.port=8080
```

- `spring.datasource.url`: URL of your database
- `spring.datasource.username`: Your MySQL username
- `spring.datasource.password`: Your MySQL password
- `spring.jpa.hibernate.ddl-auto`: Set to `update` for automatic schema updates or `create` for a fresh database
- `server.port`: Port where the application will run (default is 8080)

## Running the Application
1. Build and run the project using Maven:
   ```bash
   mvn spring-boot:run
   ```
2. Alternatively, run it from your IDE by executing the `JobPortalApplication` class.

3. Open your browser and navigate to:
   ```
   http://localhost:8080
   ```

## Project Structure
```
job-portal/
│
├── src/
│   ├── main/
│   │   ├── java/com/example/jobportal/
│   │   │   ├── controller/      # Spring MVC controllers
│   │   │   ├── entity/          # JPA entities (e.g., Job, User)
│   │   │   ├── repository/      # Spring Data JPA repositories
│   │   │   ├── service/         # Business logic
│   │   │   └── JobPortalApplication.java  # Main Spring Boot application class
│   │   └── resources/
│   │       ├── static/          # CSS, JS, and other static assets
│   │       ├── templates/       # Thymeleaf HTML templates
│   │       └── application.properties  # Configuration file
│   └── test/                    # Unit and integration tests
├── pom.xml                      # Maven configuration file
└── README.md                    # This file
```

## Usage
- **Employers**: Register/login, post jobs, and manage applications.
- **Job Seekers**: Register/login, search for jobs, and apply with a resume.
- **Admin** (optional): Manage users and job postings (if implemented).

Explore the application at `http://localhost:8080` after starting it.

## Contributing
Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Make your changes and commit (`git commit -m "Add your message"`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Open a Pull Request.

Please ensure your code follows the project's coding standards and includes appropriate tests.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
