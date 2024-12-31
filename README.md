Bank Account Management API
This project is a Bank Account Management API built using Spring Boot. The API allows users to perform CRUD operations on bank accounts, including creating new accounts, retrieving account details, updating account balances through deposit or withdrawal operations, and deleting accounts.

Features
Account Management:

Create new accounts.
Retrieve account details by ID.
View a list of all accounts.
Transaction Operations:

Deposit funds into an account.
Withdraw funds from an account (with insufficient balance check).
Account Deletion:

Delete an account by ID.
Project Structure
The project is structured as follows:

entity: Contains the Account class mapped to the database table.
dto: Includes the AccountDto class used for data transfer between layers.
service: Defines the AccountService interface and its implementation in AccountServiceImpl.
repository: Manages data access operations with the AccountRepository interface.
mapper: Contains the AccountMapper utility class for mapping between Account and AccountDto.
controller: Handles HTTP requests via RESTful endpoints.
Endpoints
Base URL: /api/accounts
Create Account

POST /
Request Body: JSON object with accountholdername and balance.
Get Account by ID

GET /{id}
Path Variable: id (Long).
Deposit Funds

PUT /{id}/deposit
Path Variable: id (Long).
Request Body: JSON object with amount.
Withdraw Funds

PUT /{id}/withdraw
Path Variable: id (Long).
Request Body: JSON object with amount.
Get All Accounts

GET /
Delete Account

DELETE /{id}
Path Variable: id (Long).

Tech Stack
Backend
Java 17
Spring Boot
Spring Data JPA
Hibernate
Database
MySQL
Build Tool
Maven
