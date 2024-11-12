# Price Service API

## Overview

The Price Service API is a Spring Boot RESTful service designed for querying product prices based on brand, product, and date criteria. It provides endpoints to fetch the applicable price of a product for a specific date, making it suitable for dynamic pricing and real-time queries.

## Features

This API offers the following features:

- **REST API for Price Lookup**: Query product prices by brand, product ID, and date.
- **In-Memory Database**: Uses H2 to store and retrieve price data for rapid prototyping.
- **Layered Architecture**: Structured with service and repository layers for separation of concerns.
- **Unit Testing**: Includes unit tests to validate endpoint functionality and ensure reliability.

### Project Setup Overview

To build and run this Spring Boot application, the following setup is implemented:

1. **Define the Project** with required dependencies in `pom.xml`.
2. **Configure H2 Database** with initial example data for testing.
3. **Create Entities and Repositories** for database interactions.
4. **Implement Service Logic** to handle pricing logic based on given criteria.
5. **Develop a REST Controller** to expose the endpoint.
6. **Write Unit Tests** for validation of business logic and REST endpoints.

### Technology Stack

- **Backend Framework**: Spring Boot 3
- **ORM**: Spring Data JPA
- **Build Tool**: Maven
- **Database**: H2 (in-memory database)

## Prerequisites

- **Java** 17 or later
- **Maven** 3.6 or later

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/raphacano/inditexProject
 
 
2. Build the Project:
	```bash
	mvn clean install
	
	
## Getting Started	

1. Run the Application:
	```bash
	mvn spring-boot:run
	
	
This will start the server, typically on http://localhost:8080
	
2. Testing the Application
	```bash
	mvn test
	

## API Documentation

Once the application is running, you can access the API endpoint for price queries. Here’s a sample endpoint:

Endpoint: /api/prices
Method: GET

Description: Retrieves the applicable price for a given product, brand, and date.

Parameters:

productId (required): ID of the product to query.
brandId (required): ID of the brand.
applicationDate (required): Date and time for which the price is queried (format: yyyy-MM-dd'T'HH:mm:ss).

Example Request:

```bash
GET /api/prices?productId=35455&brandId=1&applicationDate=2023-11-12T10:00:00

Response:

{
    "productId": 35455,
    "brandId": 1,
    "price": 35.50,
    "currency": "EUR",
    "startDate": "2023-11-10T00:00:00",
    "endDate": "2023-11-20T23:59:59"
}


Database Configuration

The application is configured to use an in-memory H2 database for demonstration purposes. To view the database console:

Access the H2 Console at http://localhost:8080/h2-console.
Use the following JDBC URL to connect:
jdbc:h2:mem:testdb

Additional Notes
The initial data is populated in the H2 database when the application starts, based on data.sql.
The API is designed for demonstration purposes and can be extended with additional pricing rules or a persistent database for production use.
