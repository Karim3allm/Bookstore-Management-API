## Project Overview
This project contains API automated test framework for an Bookstore Management System. using REST Assured with Java. The framework includes:
- TestNG as the testing framework
- Allure for comprehensive test reporting
- Maven Plugins
- Jackson Databind

## Prerequisites

Before running the tests, ensure you have the following installed:

- Java 17.0.14 
- Apache Maven 3.9.10
- Allure Commandline (for report generation)
- TestNG repository is added
- Maven Plugins is added
-  Rest-assured dependencies
## Installation

- Clone the repository:
   ```bash
   git clone https://github.com/Karim3allm/Bookstore-Management-API.git

- Run Test:
  ```bash
   mvn clean test

- Generate Allure results report:
  ```bash
  allure serve allure-results
