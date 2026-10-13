TOURIST MANAGEMENT API

A REST API built using Spring Boot to manage tourist records and update tourist information with token-based validation.

TECHNOLOGIES USED
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman

FEATURES
- Update existing tourist records.
- Store tourist information in a MySQL database.
- Validate API requests using a token header.
- Return HTTP status codes for successful and unauthorized requests.

DATABASE CONFIGURATION
1. Install and start MySQL.
2. Create a database named touristdb using this SQL command:

CREATE DATABASE touristdb;

3. Configure your local application.properties file with your MySQL connection details.
4. Keep your database password private. Do not upload real credentials to GitHub.

RUN THE APPLICATION
1. Make sure Java and MySQL are installed and running.
2. Open a terminal in the project directory.
3. Run this command:

mvnw.cmd spring-boot:run

The application runs at:

http://localhost:8080

API DOCUMENTATION

Update Tourist Record

HTTP Method: PUT
Endpoint: /api/tourists/{id}
Example URL: http://localhost:8080/api/tourists/1
Header: Token: valid-token
Content-Type: application/json

REQUEST HEADERS

Token: valid-token
Content-Type: application/json

EXAMPLE REQUEST BODY

{
  "name": "Rahul",
  "destination": "Goa",
  "contact": "9876543210"
}

Replace the ID in the example URL with the ID of the tourist record you want to update.

EXPECTED RESPONSES
- 200 OK: The tourist record was updated successfully.
- 401 Unauthorized: The token is missing or invalid, according to the application's validation logic.

TESTING WITH POSTMAN
1. Start the Spring Boot application.
2. Open Postman and create a new request.
3. Select the PUT method.
4. Enter the URL, for example: http://localhost:8080/api/tourists/1
5. Under Headers, add Token with the value valid-token.
6. Under Headers, add Content-Type with the value application/json.
7. Select Body, then raw, then JSON.
8. Enter the example request body shown above.
9. Click Send and check the response.
10. Test with an invalid token to verify unauthorized access handling.

SECURITY NOTE
The token validation in this project is intended for demonstration and lab practice. The hardcoded token is not suitable for production authentication. Use secure authentication and environment-based configuration for real applications.

AUTHOR
Manoj Kumar
