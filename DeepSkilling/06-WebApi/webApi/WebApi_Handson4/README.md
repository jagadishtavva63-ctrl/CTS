# WebApi Handson 4 — Complex Models (Employee / Department / Skill)

> **Week 2 · CTS Deep Skilling · ASP.NET Core Web API**

## Overview

Demonstrates working with **nested and related domain models** in an ASP.NET Core Web API. The `Employee` model now contains an embedded `Department` object and a `List<Skill>`, simulating a realistic HR data API with hierarchical JSON structures.

### Learning Objectives

- Design nested model classes representing real-world data relationships
- Serialise and deserialise complex, nested JSON request/response bodies
- Use `List<T>` properties inside API models
- Understand ASP.NET Core's built-in JSON serialisation (`System.Text.Json`)
- Return shaped response objects with related data in a single API call

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
WebApi_Handson4/
├── WebApi_Handson4.csproj
├── Program.cs
├── appsettings.json
├── Properties/
│   └── launchSettings.json
├── Controllers/
│   └── EmployeeController.cs       # CRUD with complex Employee model
└── Models/
    ├── Employee.cs                  # Id, Name, Department, List<Skill>
    ├── Department.cs                # Id, Name
    └── Skill.cs                     # Id, Name
```

---

## Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)

---

## How to Run

```bash
cd "week 2/webApi/WebApi_Handson4"
dotnet restore
dotnet build
dotnet run
```

Open Swagger UI: **http://localhost:5004/swagger**

---

## Data Model

```json
{
  "id": 1,
  "name": "Alice Smith",
  "department": {
    "id": 10,
    "name": "Engineering"
  },
  "skills": [
    { "id": 1, "name": "C#" },
    { "id": 2, "name": "SQL Server" },
    { "id": 3, "name": "ASP.NET Core" }
  ]
}
```

---

## API Endpoints

| Method | Route | Description |
|--------|-------|-------------|
| `GET` | `/api/employee` | Get all employees (with nested department and skills) |
| `GET` | `/api/employee/{id}` | Get employee by ID |
| `POST` | `/api/employee` | Create employee with nested objects |
| `PUT` | `/api/employee/{id}` | Update employee and nested data |
| `DELETE` | `/api/employee/{id}` | Delete employee |

---

## Entity Relationship

```
Employee
  ├── Department (1 : 1)
  │     └── Id, Name
  └── Skills     (1 : many)
        └── Id, Name
```

---

*Part of CTS Deep Skilling — Week 2 Web API Module*
