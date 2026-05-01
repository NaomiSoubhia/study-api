# 📄 README.md - Swagger

```md
# 📚 Study API

A RESTful API built for managing study-related resources such as notes, tasks, or learning materials.  
This project was developed to practice backend development, API design, and documentation using Swagger.

---

## 🚀 Features

- Full CRUD operations
- RESTful architecture
- JSON data handling
- Organized MVC structure (if applicable)
- API documentation with Swagger
- Scalable backend foundation

---

## 🛠️ Technologies Used

- Node.js
- Express.js
- Swagger (OpenAPI)
- (Add your DB here → MongoDB / MySQL / SQLite)
- Postman (for testing)
- Git & GitHub

---

## 📂 Project Structure

```

study-api/
│── src/
│   ├── controllers/
│   ├── routes/
│   ├── models/
│   ├── config/
│   └── app.js
│
│── swagger/
│   └── swagger.js
│
│── package.json
│── README.md

````

---

## ⚙️ Installation

1. Clone the repository:
```bash
git clone https://github.com/NaomiSoubhia/study-api.git
cd study-api
````

2. Install dependencies:

```bash
npm install
```

3. Start the server:

```bash
npm start
```

---

## 🌐 API Base URL

```
http://localhost:3000
```

---

## 📡 API Endpoints

| Method | Endpoint   | Description     |
| ------ | ---------- | --------------- |
| GET    | /items     | Get all items   |
| GET    | /items/:id | Get item by ID  |
| POST   | /items     | Create new item |
| PUT    | /items/:id | Update item     |
| DELETE | /items/:id | Delete item     |

---

## 📖 Swagger API Documentation

This project uses **Swagger (OpenAPI)** to provide interactive API documentation.

### ▶️ How to Access Swagger UI

After starting the server, open your browser and go to:

```
http://localhost:3000/api-docs
```

---

### ⚙️ Swagger Setup (if not implemented yet)

Install dependencies:

```bash
npm install swagger-ui-express swagger-jsdoc
```

---

### 📄 Swagger Configuration Example

Create a file:

```
/swagger/swagger.js
```

```javascript
const swaggerJsDoc = require("swagger-jsdoc");
const swaggerUi = require("swagger-ui-express");

const swaggerOptions = {
  definition: {
    openapi: "3.0.0",
    info: {
      title: "Study API",
      version: "1.0.0",
      description: "API for managing study resources"
    },
    servers: [
      {
        url: "http://localhost:3000"
      }
    ]
  },
  apis: ["./src/routes/*.js"]
};

const swaggerDocs = swaggerJsDoc(swaggerOptions);

module.exports = (app) => {
  app.use("/api-docs", swaggerUi.serve, swaggerUi.setup(swaggerDocs));
};
```

---

### 📌 Example Route with Swagger Annotation

```javascript
/**
 * @swagger
 * /items:
 *   get:
 *     summary: Returns all items
 *     responses:
 *       200:
 *         description: Success
 */
router.get("/items", controller.getAllItems);
```

---

## 🧪 Testing

You can test the API using:

* Swagger UI (`/api-docs`)
* Postman
* Thunder Client
* cURL

Example:

```bash
curl http://localhost:3000/items
```

---

## 🎯 Purpose of the Project

This project was created to:

* Practice backend API development
* Understand RESTful architecture
* Learn API documentation with Swagger
* Improve software engineering skills for internships and co-op roles

---

## 📈 Future Improvements

* Authentication (JWT)
* Role-based access control
* Database optimization
* Advanced error handling
* Deployment (Render / Railway / AWS)
* Unit testing (Jest)


