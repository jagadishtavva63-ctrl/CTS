# WebApi Handson 3 — Custom Filters & Exception Handling

> **Week 2 · CTS Deep Skilling · ASP.NET Core Web API**

## Overview

Demonstrates how to intercept the HTTP request/response pipeline using **ASP.NET Core Action Filters**. Builds a `CustomAuthFilter` that validates the `Authorization` header before each action runs, and a `CustomExceptionFilter` that catches unhandled exceptions and returns structured error responses.

### Learning Objectives

- Implement `ActionFilterAttribute` to intercept action execution
- Create a `CustomAuthFilter` that enforces `Authorization: Bearer <token>` on every request
- Create a `CustomExceptionFilter` that catches exceptions globally and returns `500` with structured JSON
- Register filters in DI with `AddScoped<TFilter>()` and apply via `[ServiceFilter(typeof(...))]`
- Understand the ASP.NET Core filter pipeline execution order

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
WebApi_Handson3/
├── WebApi_Handson3.csproj
├── Program.cs                      # Registers filters in DI
├── appsettings.json
├── Properties/
│   └── launchSettings.json
├── Controllers/
│   └── EmployeeController.cs       # Decorated with [ServiceFilter(typeof(CustomAuthFilter))]
├── Filters/
│   ├── CustomAuthFilter.cs         # Validates Authorization header
│   └── CustomExceptionFilter.cs    # Catches unhandled exceptions
└── Models/
    ├── Employee.cs
    ├── Department.cs
    └── Skill.cs
```

---

## Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)

---

## How to Run

```bash
cd "week 2/webApi/WebApi_Handson3"
dotnet restore
dotnet build
dotnet run
```

Open Swagger UI: **http://localhost:5002/swagger**

---

## Filter Behaviour

| Filter | When It Runs | Behaviour |
|--------|-------------|-----------|
| `CustomAuthFilter` | **Before** every action | Checks for `Authorization` header; returns `400 Bad Request` if missing or not Bearer |
| `CustomExceptionFilter` | **After** an unhandled exception | Returns `500 Internal Server Error` with JSON error message |

---

## Testing the Auth Filter

```bash
# Without Authorization header → 400 Bad Request
curl http://localhost:5002/api/employee

# Missing Bearer keyword → 400 Bad Request
curl -H "Authorization: Basic abc123" http://localhost:5002/api/employee

# Valid Bearer token → 200 OK
curl -H "Authorization: Bearer mytoken123" http://localhost:5002/api/employee
```

---

## Filter Pipeline Diagram

```
HTTP Request
     │
     ▼
[CustomAuthFilter.OnActionExecuting]   ← runs BEFORE action
     │
     ▼
[EmployeeController.GetAll()]          ← controller action
     │
     ▼
[CustomAuthFilter.OnActionExecuted]    ← runs AFTER action
     │
     ▼
HTTP Response

    *** If exception is thrown ***
     │
     ▼
[CustomExceptionFilter.OnException]    ← catches all unhandled exceptions
```

---

*Part of CTS Deep Skilling — Week 2 Web API Module*
