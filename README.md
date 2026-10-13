\# Tourist Management API



A Spring Boot REST API for managing tourist information and updating tourist records with token-based validation.



\## Technologies Used



\- Java

\- Spring Boot

\- Spring Data JPA

\- MySQL

\- Maven

\- Postman



\## Features



\- Update tourist details using a REST API.

\- Store tourist information in a MySQL database.

\- Validate requests using a token header.

\- Return HTTP status codes for successful and unauthorized requests.



\## Database Configuration



1\. Create a MySQL database named `touristdb`.

2\. Configure your local `application.properties` file with your MySQL connection details.

3\. Keep database passwords private. Do not commit real credentials to GitHub.



\## Run the Application



1\. Install Java and MySQL.

2\. Configure the database connection.

3\. Open a terminal in the project directory.

4\. Run the application using:



&#x20;  ```bash

&#x20;  mvnw.cmd spring-boot:run

&#x20;  ```



The application runs on `http://localhost:8080` by default.



\## API Endpoint



\*\*Update a tourist\*\*



\- Method: `PUT`

\- URL: `/api/tourists/{id}`

\- Header: `Token: valid-token`

\- Content-Type: `application/json`



Example request body:



```json

{

&#x20; "name": "Rahul",

&#x20; "destination": "Goa",

&#x20; "contact": "9876543210"

}

```



Replace the ID in the URL with the tourist record you want to update.



\## Testing



Use Postman to send a PUT request with the required token header and JSON body. A valid token should allow the update; an invalid token should return an unauthorized response.



\## Author



Manoj Kumar

