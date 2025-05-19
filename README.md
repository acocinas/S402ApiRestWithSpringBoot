# 🍓 Spring Boot Fruit API - S04T02N01GognomosNo

This is a simple RESTful API built with Spring Boot as part of the ItAcademy curriculum.  
It allows CRUD operations on a list of fruits using an in-memory H2 database and follows the MVC architecture.

---

## 📦 Technologies Used

- ☕ Java 21+
- 🔧 Spring Boot 3.4.5
- 💾 Spring Data JPA
- 🛢️ H2 Database (in-memory)
- 📦 Maven
- 🧪 Postman (for testing)
- 🧰 IntelliJ IDEA

---

## 📁 Project Structure

```
cat.itacademy.s04.t02.n01
├── controller         # REST controllers
├── service            # Business logic layer
├── model              # JPA entity: Fruit
├── repository         # Spring Data JPA repository
├── exception          # Custom exception and global handler
└── S04T02N01Application.java
```

---

## 🍎 Entity: `Fruit`

```java
int id;
String name;
int quantityKilos;
```

---

## 🔗 API Endpoints

| Method | Endpoint                  | Description              |
|--------|---------------------------|--------------------------|
| POST   | `/fruit/add`              | Add a new fruit          |
| PUT    | `/fruit/update`           | Update an existing fruit |
| DELETE | `/fruit/delete/{id}`      | Delete a fruit by ID     |
| GET    | `/fruit/getOne/{id}`      | Retrieve fruit by ID     |
| GET    | `/fruit/getAll`           | Retrieve all fruits      |

✅ All endpoints return `ResponseEntity` and proper HTTP status codes.  
🛑 Invalid input or not found resources are handled with a `GlobalExceptionHandler`.

---

## 🧪 Testing the API with Postman

1. Start the application.
2. Open [Postman](https://www.postman.com/) and send requests to:

```
http://localhost:8080/fruit/add
```

Example POST body (JSON):
```json
{
  "name": "Kiwi",
  "quantityKilos": 10
}
```

---

## 🛢️ H2 Database Console

Access the H2 Web Console to inspect the database:

- 🔗 http://localhost:8080/h2-console
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: *(leave empty)*

Example query:
```sql
SELECT * FROM FRUIT;
```

---

## 🧹 .gitignore Highlights

This project uses a top-level `.gitignore` to exclude:
- IntelliJ files (`.idea/`)
- Maven target folders (`target/`)
- Log files and OS-specific files
- Compiled class files (`*.class`)

Also includes Maven wrapper files (`mvnw`, `.mvn/`) for portability.

---

## 📚 References

- 🧠 [Spring Boot + JPA + H2 guide (official)](https://spring.io/guides/gs/accessing-data-jpa/)
- 📺 [API REST with Spring Boot + Postman (YouTube)](https://www.youtube.com/watch?v=4yLzGq_vhg8)

---

## 🚀 Deployment (optional)

You can deploy this API using services like:

- [⚙️ Railway](https://railway.app/)
- [☁️ Heroku](https://www.heroku.com/) *(deprecated for free tier)*

Steps (example for Railway):
1. Push this project to GitHub
2. Login to Railway and select "Deploy from GitHub"
3. Set build command to `mvn clean package`
4. Set start command to `java -jar target/S04T02N01-0.0.1-SNAPSHOT.jar`
5. Add port environment variable if needed: `PORT=8080`

---

## 👨‍💻 Author

**Alfonso**  
🎓 Project for [ItAcademy](https://itacademy.barcelonactiva.cat/)  
📅 2025
