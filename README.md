
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
