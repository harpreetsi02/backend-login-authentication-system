# Login & Authentication API

A backend authentication system built with Spring Boot that allows users to register and login securely. The application stores user credentials in a MySQL database and validates login requests using encrypted passwords.

## Features

* User registration
* Secure login authentication
* Password encryption using BCrypt
* MySQL database integration
* RESTful API endpoints
* Layered architecture (Controller → Service → Repository)

## Tech Stack

* Java
* Spring Boot
* Spring Web
* Spring Security
* Spring Data JPA
* MySQL
* BCrypt Password Encoder
* Maven
* Postman (API testing)

## API Endpoints

### Register User

POST /auth/register

Example Request:
{
"name": "Harpreet",
"email": "user@test.com",
"password": "123456"
}

### Login User

POST /auth/login

Example Request:
{
"email": "user@test.com",
"password": "123456"
}

If credentials are valid, the system authenticates the user successfully.

## Project Structure

controller → Handles API requests
service → Business logic for authentication
repository → Database operations using JPA
entity → User entity mapped to MySQL table

## Run Locally

1. Clone the repository
   git clone https://github.com/yourusername/login-auth-api.git

2. Navigate to project folder
   cd login-auth-api

3. Configure MySQL database in application.properties

4. Run the application
   mvn spring-boot:run

Server runs at:
http://localhost:8080
