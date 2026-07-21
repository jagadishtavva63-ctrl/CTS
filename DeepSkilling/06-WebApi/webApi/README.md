# ASP.NET Core Web API — Hands-On Series (Week 2)

> **Week 2 · CTS Deep Skilling · Web API Track**

## Overview

Six progressive hands-on projects building from a minimal CRUD REST API to JWT-secured endpoints and Apache Kafka messaging — all using ASP.NET Core.

| Handson | Topic | Swagger URL |
|---------|-------|-------------|
| [Handson 1](WebApi_Handson1/) | First CRUD API — Values | `http://localhost:5000/swagger` |
| [Handson 2](WebApi_Handson2/) | Employee CRUD API | `http://localhost:5000/swagger` |
| [Handson 3](WebApi_Handson3/) | Custom Filters & Exception Handling | `http://localhost:5002/swagger` |
| [Handson 4](WebApi_Handson4/) | Complex Models (Employee/Department/Skill) | `http://localhost:5004/swagger` |
| [Handson 5](WebApi_Handson5/) | JWT Authentication | `http://localhost:5000/swagger` |
| [Handson 6](WebApi_Handson6/) | Apache Kafka Producer/Consumer | N/A (console apps) |

---

## Technologies Used

| Technology | Version | Purpose |
|------------|---------|---------|
| C# / .NET | 10.0 | Language & runtime |
| ASP.NET Core | 10.0 | Web API framework |
| Swashbuckle / Swagger | 7.2.0 | API documentation UI |
| JWT Bearer | 10.0 | Token-based authentication |
| Confluent.Kafka | 2.8.0 | Apache Kafka messaging |

---

## Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)
- Visual Studio 2022 **or** VS Code with C# Dev Kit
- Apache Kafka (Handson 6 only) — running on `localhost:9092`

---

## Quick Start

```bash
# Pick any handson and run:
cd "week 2/webApi/WebApi_Handson1"
dotnet restore
dotnet run
# Open: http://localhost:5000/swagger
```

---

## Progression Path

```
Handson 1 → Handson 2 → Handson 3 → Handson 4 → Handson 5 → Handson 6
   CRUD        Models     Filters    Complex      JWT Auth     Kafka
  (string)   (Employee)  & Errors    Models      Security    Messaging
```

---

*Part of CTS Deep Skilling — Week 2 Web API Module*
