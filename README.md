# Intern Demo - Spring Boot + PostgreSQL

## 📋 Project Structure

```
intern-demo/
├── src/
│   └── main/
│       ├── java/com/example/interndemo/
│       │   ├── InternDemoApplication.java      ← Main class
│       │   ├── controller/
│       │   │   └── HelloController.java        ← GET /hello
│       │   ├── entity/
│       │   │   └── User.java                   ← @Entity
│       │   └── repository/
│       │       └── UserRepository.java         ← JpaRepository
│       └── resources/
│           └── application.properties          ← DB config
└── pom.xml                                     ← Dependencies
```

## 🚀 Setup Instructions

### Step 1: PostgreSQL Database Setup

```sql
-- Open pgAdmin or psql terminal and run:
CREATE DATABASE intern_demo;
```

### Step 2: Update application.properties

Edit `src/main/resources/application.properties`:
```properties
spring.datasource.username=postgres         ← your PostgreSQL username
spring.datasource.password=your_password    ← your PostgreSQL password
```

### Step 3: Run the Project

**Option A - Using Maven:**
```bash
./mvnw spring-boot:run
```

**Option B - Using IntelliJ IDEA:**
- Open the project
- Right-click `InternDemoApplication.java`
- Click "Run"

### Step 4: Test the Endpoint

Open browser and go to:
```
http://localhost:8080/hello
```
Should show: `Hello, World!`

## ✅ What's Included

| Feature | Status |
|---------|--------|
| Spring Boot 3.2 | ✅ |
| GET /hello endpoint | ✅ |
| PostgreSQL connection | ✅ |
| User Entity (@Entity) | ✅ |
| UserRepository (JpaRepository) | ✅ |
| Thymeleaf (for tomorrow) | ✅ |

## 🔍 DB Connection Success Log

When connected successfully, console will show:
```
HikariPool-1 - Start completed.
Hibernate: create table if not exists users (...)
Started InternDemoApplication in X.XXX seconds
```
