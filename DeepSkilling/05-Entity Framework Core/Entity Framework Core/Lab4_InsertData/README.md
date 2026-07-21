# Lab 4 — Insert Data

> **Week 2 · CTS Deep Skilling · Entity Framework Core**

## Overview

Demonstrates how to insert data into SQL Server using EF Core's `Add()` / `AddRange()` methods and persist it with `SaveChanges()`.

### Learning Objectives

- Use `context.Add(entity)` to insert a single record
- Use `context.AddRange(entities)` to insert multiple records
- Call `context.SaveChanges()` to commit to the database
- Understand that EF Core tracks new entities as `Added` state

---

## Technologies Used

| Technology | Version |
|------------|----------|
| C# / .NET | 10.0 |
| Entity Framework Core | 9.0.7 |
| EF Core SQL Server | 9.0.7 |
| SQL Server | 2019+ |

---

## Folder Structure

```
Lab4_InsertData/
├── Lab4_InsertData.csproj
├── AppDbContext.cs
├── Category.cs
├── Product.cs
└── Program.cs          # Inserts Category and Product records
```

---

## How to Run

```bash
cd "week 2/Entity Framework Core/Lab4_InsertData"
dotnet restore
dotnet run
```

> Ensure the database exists and migrations have been applied (see Lab 3).

---

*Part of CTS Deep Skilling — Week 2 EF Core Module*
