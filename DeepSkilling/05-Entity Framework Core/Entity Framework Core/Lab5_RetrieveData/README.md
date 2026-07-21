# Lab 5 — Retrieve Data

> **Week 2 · CTS Deep Skilling · Entity Framework Core**

## Overview

Demonstrates how to query data from SQL Server using EF Core's query API — including `ToList()`, `Find()`, `FirstOrDefault()`, and `Single()`.

### Learning Objectives

- Load all records using `.ToList()`
- Find a record by primary key using `.Find(id)`
- Retrieve a filtered record using `.FirstOrDefault(predicate)`
- Understand deferred vs immediate execution in EF Core LINQ
- Use `.Include()` for eager loading of related entities

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
Lab5_RetrieveData/
├── Lab5_RetrieveData.csproj
├── AppDbContext.cs
├── Category.cs
├── Product.cs
└── Program.cs          # Retrieval examples
```

---

## How to Run

```bash
cd "week 2/Entity Framework Core/Lab5_RetrieveData"
dotnet restore
dotnet run
```

> Ensure data has been inserted (see Lab 4) before running.

---

*Part of CTS Deep Skilling — Week 2 EF Core Module*
