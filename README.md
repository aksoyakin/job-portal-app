# Job Portal Application

This project is a job listing and application portal developed using **Spring Boot** and **Thymeleaf**. The application allows recruiters to create and share job listings, while job seekers can search for jobs, view details, and apply for positions.

## Features

- **Job Listing Management**: Recruiters can create, edit, and delete job listings.
- **Job Search and Application**: Job seekers can search for job listings, view details, and apply for positions.
- **User Management**: Supports two types of user profiles (Recruiter and Job Seeker) with different permissions.

## Technologies

- **Spring Boot**: A framework used for building Java-based web applications.
- **Thymeleaf**: A server-side HTML template engine.
- **Spring Security**: Used for authentication and authorization.
- **Spring Data JPA**: Used for database operations.
- **MySQL**: The relational database used for data storage.

## Getting Started

To run the project locally, follow these steps:

1. **Clone the Repository**

   ```bash
   git clone https://github.com/aksoyakin/job-portal-app.git
   cd job-portal-app

2. **Install Dependencies**
    ```bash
   ./mvnw install

2. **Run the Application**
    ```bash
   ./mvnw spring-boot:run
    
## Configuration
The default configuration file is located at src/main/resources/application.properties. You can configure database connection settings and other application properties here.

## Database Diagram
![database-diagram](https://github.com/user-attachments/assets/df119fec-f439-452d-be2c-4355162e40bd)

## Photos
![post-job](https://github.com/user-attachments/assets/693219e2-0dd4-46a2-8920-a62ac7d5d42f)
![filter](https://github.com/user-attachments/assets/dc8a83b8-a710-4a11-94da-f687d81370e4)


