# 🎓 Student Management System (Spring Boot)

A simple backend REST API built using **Spring Boot** that performs full CRUD operations on Student data.
This project demonstrates clean architecture, validation, and global exception handling.

---

## 🚀 Features

* ✅ Create Student
* ✅ Get All Students
* ✅ Get Student by ID
* ✅ Update Student
* ✅ Delete Student
* ✅ Input Validation (Email, Age, etc.)
* ✅ Global Exception Handling
* ✅ Proper HTTP Status Codes

---

## 🛠️ Tech Stack

* **Java 22**
* **Spring Boot**
* **Spring Data JPA**
* **Hibernate**
* **MySQL**
* **Maven**

---

## 📂 Project Structure

```
Controller → Handles HTTP requests
Service    → Business logic
Repository → Database interaction
Entity     → Database model
Exception  → Global exception handling
```

---

## 📌 API Endpoints

### 🔹 Create Student

```
POST /students
```

### 🔹 Get All Students

```
GET /students
```

### 🔹 Get Student by ID

```
GET /students/{id}
```

### 🔹 Update Student

```
PUT /students/{id}
```

### 🔹 Delete Student

```
DELETE /students/{id}
```

---

## 🧪 Sample Request (POST)

```json
{
  "name": "Priyanshu",
  "email": "test@gmail.com",
  "age": 20,
  "className": "BCA"
}
```

---

## ⚠️ Validation Rules

* Name cannot be empty
* Email must be valid
* Age must be greater than 12
* Class cannot be empty

---

## ❌ Error Handling

This project uses **Global Exception Handling** to return meaningful errors.

Example:

```json
{
  "message": "Student not found",
  "status": 404
}
```

---

## 🧠 What I Learned

* How Spring Boot handles request flow (Controller → Service → Repository)
* How to design REST APIs
* How to use validation annotations
* How to handle exceptions globally
* How to structure a clean backend project

---

## 🔥 Future Improvements

* Add Authentication (Spring Security + JWT)
* Add Pagination & Sorting
* Add DTO layer
* Add Swagger Documentation

---

## 👨‍💻 Author

**Priyanshu**
Aspiring Backend Developer 🚀

---

## ⭐ If you like this project

Give it a star ⭐ on GitHub!
