# Bank Management System

- [x] Bank operator functions:
    - [x] Customer registration
    - [x] Customer information edit.
    - [x] Customer password reset.
    - [x] Create bills.
    - [x] Create account.
    - [x] Account repayment.
    - [x] Account withdrawal.
    - [x] Assign loan to customer.
    - [x] Assign savings account to customer.
    - [x] Chat with customer.


- [x] Bank customer functions:
    - [x] Customer login.
    - [x] Customer details:
    - [x] Customer data.
    - [x] Accounts.
    - [x] Loans.
    - [x] Savings accounts.
    - [x] Account statement.
    - [x] Pay bill.
    - [x] Money transfer.
    - [x] Create task for bank support.


### Postman collection
- https://www.getpostman.com/collections/53cba4a6ee0ba6e9725d

> Technology stack:

* Spring Boot
* Spring Data JPA
* Hibernate
* Websocket
* H2
* Spring Security
* Lombok
* Swagger
* Yahoo Mail (Not needed)



### Set up Database

> For testing purposes used H2 database, which is embedded db that does not need any setup process.

### Running the project

> The application uses [Spring Boot](http://projects.spring.io/spring-boot/), so it is easy to run. You can start it any
of a few ways:

* Run the `main` method from `OnlineBankingManagementSystem `
* Use the Maven Spring Boot plugin: `mvn spring-boot:run`

## Viewing the running application


>  To view the running application, visit [http://localhost:8080/swagger-ui.html#/](http://localhost:8080/swagger-ui.html#/) in your browser

## Viewing the Database


>  To view the database, visit [http://localhost:8080/h2](http://localhost:8080/h2) in your browser
* Driver Class: org.h2.Driver
* JDBC URL: jdbc:h2:mem:onlineBanking
* User Name: sa
* Password:

## Application testing
### Visualisation application

> You have 2 ways to use application, please choose best fitting for yourself.

* Swagger UI
* POSTMAN

> You can easily import it into Postman app and test all functionality
> > Or just get that file as an example and use in swagger interface


### Authorizing user creation and task assignment

* Copy bearer token from login response

```json
{
  "id": ,
  "username": "",
          "email": "",
          "roles": [
    "ROLE_ADMIN"
  ],
          "tokenType": "Bearer",
          "accessToken": "eyJhbGciOiJIUzUxMiJ9......"
}
```

* and paste into Authorization field into application **( Bearer Token )**


> POSTMAN
![postman](https://user-images.githubusercontent.com/15802982/128670290-a8c6fb23-a289-424c-b6d3-2b535ad7c2d7.png)

> SWAGGER
![swagger](https://user-images.githubusercontent.com/15802982/128670597-66badf4e-f31a-46fe-8fbc-106db6151f5f.png)



### Chat user interface

> For only demonstration purposes

[![Screen-Shot-2022-08-08-at-19-29-39.png](https://i.postimg.cc/TYFNzSCD/Screen-Shot-2022-08-08-at-19-29-39.png)](https://postimg.cc/gnyKRM9z)
