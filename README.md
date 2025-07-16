# 📚 Courses & Instances Backend API (Spring Boot + MySQL)

A modular, RESTful backend API built with **Spring Boot**, **Spring Data JPA**, and **MySQL** to manage academic **courses** and their **semester-wise instances**. Ideal for educational platforms, admin dashboards, and learning management systems (LMS).

---

## 🚀 Features

✅ Built using Java + Spring Boot  
✅ Clean 3-layer architecture: `Controller`, `Service`, `Repository`  
✅ CRUD operations for Courses & Semester Instances  
✅ Structured error handling  
✅ Scalable, production-ready structure
---

## 🧪 REST API Endpoints

### 🔹 Courses
| Method | Endpoint            | Description               |
|--------|---------------------|---------------------------|
| GET    | `/api/courses`      | Get all courses           |
| GET    | `/api/courses/{id}` | Get course by ID          |
| POST   | `/api/courses`      | Add new course            |
| DELETE | `/api/courses/{id}` | Delete course by ID       |

### 🔹 Instances
| Method | Endpoint                            | Description                                 |
|--------|-------------------------------------|---------------------------------------------|
| GET    | `/api/instances`                    | Get all course instances                    |
| GET    | `/api/instances/{year}/{sem}`       | Get instances by year and semester          |
| GET    | `/api/instances/{year}/{sem}/{id}`  | Get instance by course ID + year + semester|
| POST   | `/api/instances`                    | Add new instance                            |
| DELETE | `/api/instances/{year}/{sem}/{id}`  | Delete instance by ID, year, semester       |

---

## ⚙️ Tech Stack

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **MySQL**
- **Hibernate**
- **Postman** for API testing


---

---

## 📌 How to Run Locally

```bash
# Clone repo
git clone https://github.com/ishika-thakur7802/courses-api.git
cd courses-api

# Update application.properties or set ENV vars

# Build and run
./mvnw spring-boot:run
