# Price Service API

## Overview

A Spring Boot REST API for querying product prices based on brand, product, and date.

## Features

To build this Spring Boot application, we’ll follow these steps:

Define the Spring Boot Project with required dependencies.
Set Up H2 Database with initial data from the example.
Create Entities and Repository Layer for interacting with the database.
Implement the Service Logic to find the applicable price based on input criteria.
Create a REST Controller to expose the endpoint.
Write Unit Tests for the REST endpoint to validate the requirements.
Set up a Spring Boot project with dependencies for:

Spring Web (for REST endpoints)
Spring Data JPA (for ORM support)
H2 Database (for in-memory database)


### Backend 

- Spring Boot 3
- Spring Data JPA
- Maven
- H2

## Getting Started

1. Run the application using:
   ```bash
   mvn spring-boot:run
2. Test the application using:
   ```bash
   mvn spring-boot:test