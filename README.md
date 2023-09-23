# ISC-ASSIGNMENT
I just created a small Spring Boot application as an assignment for ISC company.

# Application ER Diagram
HEAD



![ERD](https://imgtr.ee/images/2023/09/15/57730d2738ca1f267060697f12b3498b.png)


# Technologies used to create this application:
1. Spring Boot
2. Spring Data JPA
3. Hibernate as JPA Provider
4. H2 in-memory Database
5. Lombok library in order to reduce boilerplate code

# Database Initialization

* I prepopulated the database by using a data.sql file which contains insert statements. You can add more customers and cards if you want by adding your insert statements inside this file. I've already inserted 2 customer with 0371440955 and 0036451185 as the national code.


# Exposed Endpoint
* You can send your input to the API by providing national code as a path variable like the following:

```
  http://localhost:8080/api/customers/{?}

  Example:
  http://localhost:8080/api/customers/0371440955
```

# Monitoring Application Health by using Spring Actuator exposed endpoints

* The /health endpoint is used to check the health or state of the running application.
  ```
  http://localhost:8080/actuator/health
  ```
  
* Displays a complete list of all the Spring beans in your application.
  ```
  http://localhost:8080/actuator/beans
  ```
  
