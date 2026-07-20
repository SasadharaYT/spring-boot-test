# Spring Boot Student CRUD REST API

## Student Information

- **Module:** IN2201 - Software Engineering
- **Student Name:** Kodithuwakku S N
- **Student Registration Number:** 245519E

---

## Project Overview

This project implements a backend REST API managed via Apache Maven using the Spring Boot framework. It exposes full CRUD (Create, Read, Update, Delete) operations for a `Student` domain entity using a structured, layered architecture (Controller, Service, Model, and Repository).

---

## CRUD REST API Endpoints

The system implements the following REST endpoints to manage student data:

| HTTP Method | API Endpoint | Description |
| :--- | :--- | :--- |
| **POST** | `/api/items` | Create a new student record |
| **GET** | `/api/items` | Retrieve all student records |
| **GET** | `/api/items/{id}` | Retrieve a single student record by ID |
| **PUT** | `/api/items/{id}` | Update an existing student record |
| **DELETE** | `/api/items/{id}` | Delete a student record by ID |

*All endpoints return standard HTTP status codes (such as `200 OK`, `201 Created`, and `404 Not Found`).*

---

## Maven Lifecycle Commands

Execute these commands in the root directory of the project to build and run the application:

### 1. Clean Build Directory
Removes the `target` directory and all previously compiled artifacts:
```bash
./mvnw clean
