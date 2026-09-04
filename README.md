# Midas
Project repo for the JPMC Advanced Software Engineering Forage program

Core Transaction Processing Service

Overview

Midas Core is a Spring Boot-based transaction processing application developed as part of the JPMorgan Chase Software Engineering simulation through Forage.

The project focuses on processing financial transactions, validating transaction data, maintaining account balances, communicating with external services, and incorporating incentive information into transaction processing.

Technologies

* Java
* Spring Boot
* Maven
* Apache Kafka
* REST APIs
* PostgreSQL
* JPA / Hibernate
* Git / GitHub
* IntelliJ IDEA

Key Implementations

* Developed transaction-processing functionality using Java and Spring Boot.
* Implemented transaction validation to ensure transactions meet required conditions before processing.
* Integrated Apache Kafka for transaction-related messaging.
* Developed REST API communication for retrieving incentive information.
* Created an IncentiveApiClient using Spring’s RestTemplate to communicate with an external incentive service.
* Implemented an Incentive model to process incentive API responses.
* Integrated transaction and account-processing components to support balance updates.
* Used Git and GitHub for version control and tracked development progress through commits.

Project Structure

The application is organized into components responsible for transaction processing, database communication, API integration, and foundational data models.

Key areas include:

* component — application services and API clients
* foundation — core data models
* Database integration and transaction persistence
* Kafka-based messaging
* REST API integration

Development

The project was developed incrementally using Git for version control. The repository’s commit history provides a record of development progress and feature implementation.

Background

This project was completed as part of the JPMorgan Chase Software Engineering Job Simulation on Forage.

The project demonstrates practical experience with Java, Spring Boot, REST APIs, Apache Kafka, database integration, external API communication, and software development practices.
