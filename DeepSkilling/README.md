# CTS Deep Skilling — .NET Full Stack Training Repository

![.NET](https://img.shields.io/badge/.NET-10.0-512BD4?logo=dotnet)
![ASP.NET Core](https://img.shields.io/badge/ASP.NET_Core-10.0-512BD4?logo=dotnet)
![Entity Framework](https://img.shields.io/badge/Entity_Framework_Core-9.0-512BD4?logo=dotnet)
![NUnit](https://img.shields.io/badge/NUnit-4.2-22B455)

A comprehensive hands-on training repository covering .NET unit testing, ASP.NET Core Web APIs, Entity Framework Core, Apache Kafka messaging, JWT authentication, and microservices — built as part of the **CTS (Cognizant Technology Solutions) Deep Skilling** program.

---

## 📂 Repository Structure

```
DeepSkilling/
├── week 1/
│   ├── Advanced SQL/          # SQL Server advanced query labs
│   ├── Module1/               # .NET fundamentals
│   ├── Module2/               # OOP and C# concepts
│   ├── Moq/                   # Mocking with Moq framework
│   └── NUnit/                 # Unit testing with NUnit (9 hands-on labs)
├── week 2/
│   ├── Entity Framework Core/ # EF Core labs (Labs 1–9)
│   └── webApi/                # ASP.NET Core Web API (Handson 1–6)
├── week 3/
│   └── webApi/                # Advanced Web API + Kafka (Handson 3–6)
└── week 4/
    └── Microservices/         # JWT Authentication microservices
```

## 🗓️ Weekly Breakdown

### Week 1 — Testing Fundamentals

| Module | Topic | Status |
|--------|-------|--------|
| [Moq](week%201/Moq/) | Mocking with Moq + NUnit | ✅ 4/4 Tests Pass |
| [NUnit Handson 1](week%201/NUnit/NUnit/1.%20NUnit-Handson/) | Calculator — `[TestCase]`, `[Ignore]` | ✅ 4/4 Tests Pass |
| [NUnit Handson 2](week%201/NUnit/NUnit/2.%20NUnit-Handson/) | Math Library — SetUp/TearDown | ✅ 10/10 Tests Pass |
| [NUnit Handson 3](week%201/NUnit/NUnit/3.%20NUnit-Handson/) | URL Hostname Parser | ✅ 4/4 Tests Pass |
| [NUnit Handson 4](week%201/NUnit/NUnit/4.%20NUnit-Handson/) | Accounts Manager — Exception Testing | ✅ 7/7 Tests Pass |
| [NUnit Handson 5](week%201/NUnit/NUnit/5.%20NUnit-Handson/) | Collections — `CollectionAssert` | ✅ 4/4 Tests Pass |
| [NUnit Handson 6](week%201/NUnit/NUnit/6.%20NUnit-Handson/) | Four Seasons — `TestCaseSource` | ✅ 11/11 Tests Pass |
| [NUnit Handson 7](week%201/NUnit/NUnit/7.%20NUnit-Handson/) | Leap Year Calculator | ✅ 8/8 Tests Pass |
| [NUnit Handson 8](week%201/NUnit/NUnit/8.%20NUnit-Handson/) | User Manager — PAN Card Validation | ✅ 4/4 Tests Pass |
| [NUnit Handson 9](week%201/NUnit/NUnit/9.%20NUnit-Handson/) | Currency Converter — Moq Interface | ✅ 3/3 Tests Pass |

### Week 2 — Entity Framework Core + Web API

| Lab | Topic |
|-----|-------|
| [Lab 1](week%202/Entity%20Framework%20Core/Lab1_ORM_Basics/) | ORM Concepts |
| [Lab 2](week%202/Entity%20Framework%20Core/Lab2_DbContext/) | DbContext Setup |
| [Lab 3](week%202/Entity%20Framework%20Core/Lab3_Migrations/) | EF Core Migrations |
| [Lab 4](week%202/Entity%20Framework%20Core/Lab4_InsertData/) | Inserting Data |
| [Lab 5](week%202/Entity%20Framework%20Core/Lab5_RetrieveData/) | Retrieving Data |
| [Lab 6](week%202/Entity%20Framework%20Core/Lab6_UpdateDelete/) | Update & Delete |
| [Lab 7](week%202/Entity%20Framework%20Core/Lab7_LINQQueries/) | LINQ Queries |
| [Lab 8](week%202/Entity%20Framework%20Core/Lab8_SchemaChanges/) | Schema Changes |
| [Lab 9](week%202/Entity%20Framework%20Core/Lab9_DataSeeding/) | Data Seeding |

| Handson | Topic |
|---------|-------|
| [Handson 1](week%202/webApi/WebApi_Handson1/) | First Web API — CRUD on Values |
| [Handson 2](week%202/webApi/WebApi_Handson2/) | Employee CRUD API |
| [Handson 3](week%202/webApi/WebApi_Handson3/) | Custom Filters & Exception Handling |
| [Handson 4](week%202/webApi/WebApi_Handson4/) | Complex Models (Employee/Department/Skill) |
| [Handson 5](week%202/webApi/WebApi_Handson5/) | JWT Authentication |
| [Handson 6](week%202/webApi/WebApi_Handson6/) | Apache Kafka Messaging |

### Week 3 — Advanced Web API

| Handson | Topic |
|---------|-------|
| [Handson 3](week%203/webApi/WebApi_Handson3/) | Filters & Custom Auth |
| [Handson 4](week%203/webApi/WebApi_Handson4/) | Complex DTOs |
| [Handson 5](week%203/webApi/WebApi_Handson5/) | Role-Based JWT Auth |
| [Handson 6](week%203/webApi/WebApi_Handson6/) | Kafka Producer/Consumer |

### Week 4 — Microservices

| Project | Topic |
|---------|-------|
| [Question 1](week%204/Microservices/Question%201_JWTAuthentication/) | JWT Microservice — Login + Secure Endpoint |
| [Question 2](week%204/Microservices/Question%202/) | Extended JWT Microservice |

---

## 🛠️ Tech Stack

| Technology | Version | Purpose |
|------------|---------|----------|
| .NET SDK | 10.0.301 | Runtime & build toolchain |
| ASP.NET Core | 10.0 | Web API framework |
| Entity Framework Core | 9.0.7 | ORM for SQL Server |
| NUnit | 4.2.2 | Unit testing framework |
| Moq | 4.20.72 | Mocking framework |
| Confluent.Kafka | 2.8.0 | Apache Kafka .NET client |
| Swashbuckle (Swagger) | 7.2.0 | API documentation UI |
| JWT Bearer | 10.0-preview | Token-based authentication |
| SQL Server | 2019+ | Relational database |

---

## ⚡ Quick Start

### Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)
- [SQL Server](https://www.microsoft.com/en-us/sql-server) (for EF Core labs)
- [Apache Kafka](https://kafka.apache.org/downloads) (for Kafka labs)
- [Visual Studio 2022](https://visualstudio.microsoft.com/) or [VS Code](https://code.visualstudio.com/)

### Run Any Project

```bash
# Navigate to any project folder
cd "week 1/Moq"

# Restore packages
dotnet restore

# Build
dotnet build

# Run tests
dotnet test

# Run API (for web projects)
dotnet run
```

---

## ✅ Verified Build Status

| Week | Projects | Build | Tests |
|------|----------|-------|-------|
| Week 1 — Moq | 2 | ✅ | 4/4 PASS |
| Week 1 — NUnit (9 labs) | 18 | ✅ | 59/60 PASS* |
| Week 2 — EF Core (9 labs) | 9 | ✅ | N/A |
| Week 2 — WebApi (6 handson) | 7 | ✅ | N/A |
| Week 3 — WebApi (4 handson) | 5 | ✅ | N/A |
| Week 4 — Microservices | 2 | ✅ | N/A |

> *1 test intentionally marked `[Ignore]` as a demonstration of the attribute.

---

## 📋 Prerequisites for Runtime

| Requirement | Projects | Setup |
|-------------|----------|-------|
| SQL Server | EF Core Labs 2–8 | Update connection string in `AppDbContext.cs` |
| Apache Kafka | WebApi Handson 6 (Weeks 2 & 3) | Start Kafka on `localhost:9092` |
| `dotnet-ef` tool | EF Core migration commands | `dotnet tool install -g dotnet-ef` |

---

*CTS Deep Skilling Program · .NET Full Stack Track*
