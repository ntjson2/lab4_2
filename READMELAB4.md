# lab4_2

## Post-Tutorial Questions:

1.	Why is it important to create separate databases for each microservice (e.g., product_service, order_service, inventory_service)? The idea here is to create independent deployments for  decoupled environments. This is in alignment with the patterns encouraged in this course.

2.	What role does Flyway play in managing the database schema, and how does it ensure consistency across environments? Flyway in this context allows for file versioning and consistency amongst the databases within the microservices. Migrations are versioned and ordered and schemas are syncronized automatically. In a way Flyway is like Git for databases.

3.	How does Spring Data JPA simplify working with databases in each of the microservices? Spring Data JPA allows for boilerplate reduction and implementation at runtime (again taking the place for boilerplate SQL CRUD statements). Spring generates SQL based on method names like findByCustomerId(String customerId).

4.	In the InventoryService, why did we use the @Transactional(readOnly = true) annotation, and what is its significance? For the most part this feature optimizes read only transactions for performance and security. It also disallows accidental writes inside what should only be read only methods.

5.	In a microservices architecture, what are some challenges when ensuring communication between the Product, Order, and Inventory Services? One of the biggest challenges for systems like this is the reliance of network stability for service usage. If the network is down, so can be the service. Another challenge is data consistency. Since each microservice has its own database this can be tricky and can require advanced consistency patterns (sage patterns, distributed transactions, etc.)

6.	What are the advantages of using TestContainers for integration testing with MySQL in this lab? One of the many advantages of this system is the ability to spin up fresh MySQL containers each time. Also beneficial is the creation of these TestContainers in an isolated environment. In this situation having a realistice representation of a true relational database (such that of MySQL) provides real world and realistic testing.


## Postman logs

Include any Postman collections, test results, or logs generated during testing.

1. Unfortunatally I could not generate bug free postman collections or test results due to several package problems on all three of the services. Here are some of the logs:

package io.restassured does not exist
java: package io.restassured does not exist
java: package com.jayway.jsonpath does not exist
package SpringBootTest does not exist
[ERROR] /C:/Users/Lenovo/Documents/Nathan/College/Classes/Spring 2025/Microservices CSCI 361/Lab4/lab_proj2/lab4_2/src/main/java/com/example/demo/ProductServiceApplicationTests.java:[23,6] cannot find symbol
  symbol:   class BeforeEach
  location: class com.example.demo.ProductServiceApplicationTests
[ERROR] /C:/Users/Lenovo/Documents/Nathan/College/Classes/Spring 2025/Microservices CSCI 361/Lab4/lab_proj2/lab4_2/src/main/java/com/example/demo/ProductServiceApplicationTests.java:[33,6] cannot find symbol
  symbol:   class Test
  location: class com.example.demo.ProductServiceApplicationTests
[INFO] 13 errors 

