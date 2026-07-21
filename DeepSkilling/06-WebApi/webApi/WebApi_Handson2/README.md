# WebApi Handson 2 — Employee CRUD API

> **Week 2 · CTS Deep Skilling · ASP.NET Core Web API**

## Overview

Expands on Handson 1 by building a fully-typed **Employee REST API** with a domain model class. Introduces working with structured JSON request/response bodies and resource-based REST design.

### Learning Objectives

- Define a domain model (`Employee`) and use it as the API payload
- Implement full CRUD with an in-memory employee collection
- Use `[FromBody]` to bind JSON request bodies to model objects
- Use `[HttpGet("{id}")]` for parameterised route actions
- Return `201 Created` with `CreatedAtAction()` for POST responses
- Understand content negotiation and JSON serialisation

---

## Technologies Used

| Technology | Version | Purpose |
|------------|---------|---------|
| C# / .NET | 10.0 | Language & runtime |
| ASP.NET Core | 10.0 | Web framework |
| Swashbuckle.AspNetCore | 7.2.0 | Swagger/OpenAPI UI |

---

## Folder Structure

```
WebApi_Handson2/
├── WebApi_Handson2.csproj
├── Program.cs
├── appsettings.json
├── Properties/
│   └── launchSettings.json
└── Controllers/
    └── EmployeeController.cs       # CRUD on in-memory List<Employee>
```

---

## Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)

---

## How to Run

```bash
cd "week 2/webApi/WebApi_Handson2"
dotnet restore
dotnet build
dotnet run
```

Open Swagger UI: **http://localhost:5000/swagger**

---

## API Endpoints

| Method | Route | Description |
|--------|-------|-------------|
| `GET` | `/api/employee` | Get all employees |
| `GET` | `/api/employee/{id}` | Get employee by ID |
| `POST` | `/api/employee` | Create a new employee |
| `PUT` | `/api/employee/{id}` | Update employee by ID |
| `DELETE` | `/api/employee/{id}` | Delete employee by ID |

---

## Employee Model

```json
{
  "id": 1,
  "name": "Alice Smith",
  "email": "alice@example.com",
  "salary": 75000.00
}
```

---

## Sample Requests

```bash
# Get all employees
curl http://localhost:5000/api/employee

# Create an employee
curl -X POST http://localhost:5000/api/employee \
  -H "Content-Type: application/json" \
  -d '{"id": 1, "name": "Alice", "email": "alice@example.com", "salary": 75000}'

# Update an employee
curl -X PUT http://localhost:5000/api/employee/1 \
  -H "Content-Type: application/json" \
  -d '{"id": 1, "name": "Alice Updated", "email": "alice@example.com", "salary": 80000}'
```

---

*Part of CTS Deep Skilling — Week 2 Web API Module*
