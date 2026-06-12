# SpringBoot Staff Management System

## 📌 Project Overview

Staff Management System is a Spring Boot REST API project developed to perform staff management operations such as adding, updating, deleting, and viewing staff records. The application follows a layered architecture using Controller, Service, DAO, and Entity classes.

---

## 🚀 Features

- Add new staff details
- View all staff records
- Search staff by ID
- Update staff information
- Delete staff records
- REST API based architecture
- MySQL database integration

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST APIs

---

## 📂 Project Structure

src/main/java

├── Controller

├── Service

├── DAO

├── Entity

└── Configuration

src/main/resources

└── application.properties

---

## ⚙️ Database Configuration

Update the following properties in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/staffdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 🔗 API Endpoints

### Add Staff

```http
POST /staff
```

### Get All Staff

```http
GET /staff
```

### Get Staff By ID

```http
GET /staff/{id}
```

### Update Staff

```http
PUT /staff/{id}
```

### Delete Staff

```http
DELETE /staff/{id}
```

---

## ▶️ Running the Project

1. Clone the repository

```bash
git clone https://github.com/ShabdshreeLohar21/SpringBoot-Staff-Management.git
```

2. Navigate to project folder

```bash
cd SpringBoot-Staff-Management
```

3. Configure MySQL database

4. Run the application

```bash
mvn spring-boot:run
```

5. Test APIs using Postman

---

## 🎯 Learning Outcomes

- Spring Boot application development
- REST API creation
- Database integration using JPA and Hibernate
- Layered architecture implementation
- Maven project management

---

## 👩‍💻 Author

**Shabdshree Lohar**

Java Full Stack Developer | Spring Boot Enthusiast

GitHub: https://github.com/ShabdshreeLohar21
