# WebApi Handson 1 — First CRUD Web API

> **Week 2 · CTS Deep Skilling · ASP.NET Core Web API**

## Overview

Builds the very first ASP.NET Core Web API from scratch. Implements an in-memory CRUD (Create, Read, Update, Delete) API for a list of string values, introducing the core building blocks of REST APIs in .NET.

### Learning Objectives

- Create an ASP.NET Core Web API project with `dotnet new webapi`
- Understand `[ApiController]` and `[Route]` attributes
- Implement HTTP verbs: `GET`, `POST`, `PUT`, `DELETE`
- Return correct HTTP status codes (`200 OK`, `400 BadRequest`)
- Use Swagger UI for interactive API exploration and testing
- Understand the ASP.NET Core middleware pipeline

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
WebApi_Handson1/
├── WebApi_Handson1.csproj
├── Program.cs                      # App bootstrap, DI registration, middleware pipeline
├── appsettings.json                # Logging & host configuration
├── Properties/
│   └── launchSettings.json         # Debug launch profiles
└── Controllers/
    └── ValuesController.cs         # Full CRUD on in-memory List<string>
```

---

## Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)
- Visual Studio 2022 **or** VS Code with C# Dev Kit

---

## How to Run

```bash
cd "week 2/webApi/WebApi_Handson1"
dotnet restore
dotnet build
dotnet run
```

Open Swagger UI: **http://localhost:5000/swagger**

---

## API Endpoints

| Method | Route | Description | Response |
|--------|-------|-------------|----------|
| `GET` | `/api/values` | Get all values | `200 OK` — array of strings |
| `GET` | `/api/values/{id}` | Get value by index | `200 OK` or `400 BadRequest` |
| `POST` | `/api/values` | Add a new value | `200 OK` — success message |
| `PUT` | `/api/values/{id}` | Update value at index | `200 OK` or `400 BadRequest` |
| `DELETE` | `/api/values/{id}` | Delete value at index | `200 OK` or `400 BadRequest` |

---

## Key Concepts

| Concept | Implementation |
|---------|---------------|
| `[ApiController]` | Enables automatic model validation & binding source inference |
| `[Route("api/[controller]")]` | Attribute-based routing using controller name |
| `IActionResult` | Flexible HTTP response — allows returning different status codes |
| In-memory state | `static List<string> values` shared across requests |
| Swagger | `AddSwaggerGen()` + `UseSwagger()` + `UseSwaggerUI()` |
| `[HttpGet]`, `[HttpPost]`, etc. | HTTP verb-specific action mapping |

---

## Sample Requests

```bash
# Get all values
curl http://localhost:5000/api/values

# Add a new value
curl -X POST http://localhost:5000/api/values \
  -H "Content-Type: application/json" \
  -d '"NewValue"'

# Update value at index 0
curl -X PUT http://localhost:5000/api/values/0 \
  -H "Content-Type: application/json" \
  -d '"UpdatedValue"'

# Delete value at index 0
curl -X DELETE http://localhost:5000/api/values/0
```

---

*Part of CTS Deep Skilling — Week 2 Web API Module*
