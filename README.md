# ISC-ASSIGNMENT
I just created a small Spring Boot application as an assignment for ISC company.

# Application ER Diagram
![ERD](src/main/resources/img/ER Diagram.png)


![ERD Diagram](https://pasteboard.co/jbo3LgWb4Ojv.png)
<img src="https://pasteboard.co/jbo3LgWb4Ojv.png" class="lg-img">
(https://pasteboard.co/jbo3LgWb4Ojv.png)


# Technologies used to create this application:
1. Spring Boot
2. Spring Data JPA
3. Hibernate as JPA Provider
4. H2 in-memory Database
5. Lombok library in order to reduce boilerplate code

# Database Initialization

* I prepopulated the database by using a data.sql file which contains insert statements. You can add more customers and cards if you want by adding your insert statements inside this file. I've already inserted 2 customer with 0371440955 and 0036451185 as the national code.


# Exposed endpoint
* You can send your input to the API by providing national code as a path variable like the following:

```
  http://localhost:8080/api/customers/{?}

  Example:
  http://localhost:8080/api/customers/0371440955
```

