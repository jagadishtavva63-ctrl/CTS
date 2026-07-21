# Lab 1 — ORM Basics

> **Week 2 · CTS Deep Skilling · Entity Framework Core**

## Overview

Introductory lab explaining the fundamental concepts behind Object-Relational Mapping (ORM). Covers the difference between code-first and database-first approaches, and why EF Core eliminates the need to write raw SQL for CRUD operations.

### Learning Objectives

- Understand what an ORM is and the problems it solves
- Know the difference between Code-First and Database-First approaches
- Understand how entity classes map to database tables
- Recognise when raw SQL is still appropriate

---

## Technologies Used

| Technology | Version |
|------------|----------|
| C# / .NET | 10.0 |
| Entity Framework Core | 9.0.7 |

---

## Folder Structure

```
Lab1_ORM_Basics/
├── Lab1_ORM_Basics.csproj
└── Program.cs              # ORM concepts and illustrative code
```

---

## How to Run

```bash
cd "week 2/Entity Framework Core/Lab1_ORM_Basics"
dotnet restore
dotnet build
dotnet run
```

> This lab is primarily conceptual and does not require a database connection.

---

*Part of CTS Deep Skilling — Week 2 EF Core Module*
