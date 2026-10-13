\# Tourist Management API



A REST API built using Spring Boot to manage tourist records and update tourist information with token-based validation.



\## Technologies Used



\- Java

\- Spring Boot

\- Spring Data JPA

\- MySQL

\- Maven

\- Postman



\## Features



\- Update existing tourist records.

\- Store tourist information in a MySQL database.

\- Validate API requests using a token header.

\- Return HTTP status codes for successful and unauthorized requests.



\## Project Structure



```text

touristapp1/

├── src/

│   ├── main/

│   │   ├── java/com/example/demo/

│   │   │   ├── Tourist.java

│   │   │   ├── TouristRepository.java

│   │   │   ├── TouristService.java

│   │   │   ├── TouristController.java

│   │   │   └── Touristapp1Application.java

│   │   └── resources/

│   └── test/

├── pom.xml

├── mvnw

├── mvnw.cmd

├── .gitignore

└── README.md

```



\## Database Configuration



1\. Install and start MySQL.

2\. Create a database named `touristdb`.



```sql

CREATE DATABASE touristdb;

```



3\. Configure your local `application.properties` file with your MySQL connection details.

4\. Keep your database password private. Do not upload real credentials to GitHub.



\## Run the Application



Make sure Java, Maven Wrapper, and MySQL are available.



Open a terminal in the project directory and execute:



```cmd

mvnw.cmd spring-boot:run

```



The application runs at:



```text

http://localhost:8080

```



\## API Documentation



\### Update Tourist Record



\- \*\*HTTP Method:\*\* PUT

\- \*\*Endpoint:\*\* `/api/tourists/{id}`

\- \*\*Example URL:\*\* `http://localhost:8080/api/tourists/1`

\- \*\*Header:\*\* `Token: valid-token`

\- \*\*Content-Type:\*\* `application/json`



\### Request Headers



```text

Token: valid-token

Content-Type: application/json

```



\### Example Request Body



```json

{

&#x20; "name": "Rahul",

&#x20; "destination": "Goa",

&#x20; "contact": "9876543210"

}

```



Replace `1` in the example URL with the ID of the tourist record you want to update.



\### Expected Responses



\- \*\*200 OK:\*\* The tourist record was updated successfully.

\- \*\*401 Unauthorized:\*\* The token is missing or invalid, according to the application's validation logic.



\## Testing with Postman



1\. Start the Spring Boot application.

2\. Open Postman and create a new request.

3\. Select the `PUT` method.

4\. Enter the endpoint URL, such as `http://localhost:8080/api/tourists/1`.

5\. Under \*\*Headers\*\*, add `Token` with the value `valid-token`.

6\. Under \*\*Headers\*\*, add `Content-Type` with the value `application/json`.

7\. Select \*\*Body → raw → JSON\*\*.

8\. Enter the example request body.

9\. Click \*\*Send\*\* and check the response.

10\. Test with an invalid token to verify unauthorized access handling.



\## Security Note



The token validation in this project is intended for demonstration and lab practice. The hardcoded token is not suitable for production authentication. Use secure authentication and environment-based configuration for real applications.



\## Author



Manoj Kumar

