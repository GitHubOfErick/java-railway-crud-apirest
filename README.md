# Creation of an API Rest-Java spring Boot application connected to a PostgreSQL database which does the CRUD

This is an API Rest application that runs in Java-Spring Boot and connected to a PostgreSQL database. This application was made to store general products such as shampoo, toothpaste, jeans and so on like in malls. 

I decided to make it simple so the only security I am using is the username and password for the database, so there is no jwt or token or oauth security methods.

The idea is to emulate a client side by using the Postman software to send the requests like post, get, put and delete. This application is leading towards more to the back-end side.

## What tools I used?

1. Java 21 version
2. Spring Boot 4.0.1 version
3. Spring Data JPA
4. Hibernate ORM core version 7.2.0
5. Maven 4.0.0 version
6. Apache Tomcat 11.0.15 version
7. PostgreSQL image version 15
8.  PostgreSQL JDBC Driver
9. Docker Desktop application to load and run the PostgreSQL image
10. TablePlus desktop application to confirm the database is up and running
11. Postman to send the requests, put, get, post, and delete to the back-end