# Entity Framework Core — Lab Series

> **Week 2 · CTS Deep Skilling · EF Core Track**

## Overview

Nine progressive labs covering Entity Framework Core from ORM concepts through to migrations, CRUD operations, LINQ queries, schema changes, and data seeding. All labs use SQL Server as the database backend.

### Learning Objectives

- Understand Object-Relational Mapping (ORM) and its benefits
- Configure `DbContext` and entity models
- Create and apply database migrations
- Perform Create, Read, Update, Delete operations via EF Core
- Write LINQ queries against a relational database
- Seed initial data and manage schema evolution

---

## Technologies Used

| Technology | Version | Purpose |
|------------|---------|----------|
| C# / .NET | 10.0 | Language & runtime |
| Entity Framework Core | 9.0.7 | ORM framework |
| EF Core SQL Server provider | 9.0.7 | SQL Server integration |
| EF Core Design tools | 9.0.7 | Migration scaffolding |
| SQL Server | 2019+ | Relational database |

---

## Labs at a Glance

| Lab | Folder | Focus |
|-----|--------|-------|
| 1 | `Lab1_ORM_Basics` | ORM concepts — what is EF Core, code-first vs DB-first |
| 2 | `Lab2_DbContext` | `DbContext` setup, entity configuration, connection string |
| 3 | `Lab3_Migrations` | `dotnet ef migrations add`, `database update` |
| 4 | `Lab4_InsertData` | `context.Add()`, `SaveChanges()` |
| 5 | `Lab5_RetrieveData` | `context.Products.ToList()`, `Find()`, `FirstOrDefault()` |
| 6 | `Lab6_UpdateDelete` | `context.Update()`, `context.Remove()` |
| 7 | `Lab7_LINQQueries` | LINQ `Where()`, `OrderBy()`, `Select()`, `Join()` |
| 8 | `Lab8_SchemaChanges` | Adding columns via new migrations |
| 9 | `Lab9_DataSeeding` | `modelBuilder.Entity<T>().HasData()` |

---

## Folder Structure

```
Entity Framework Core/
├── Lab1_ORM_Basics/
├── Lab2_DbContext/
│   ├── AppDbContext.cs
│   ├── Product.cs
│   ├── Category.cs
│   └── Program.cs
├── Lab3_Migrations/
├── Lab4_InsertData/
├── Lab5_RetrieveData/
├── Lab6_UpdateDelete/
├── Lab7_LINQQueries/
├── Lab8_SchemaChanges/
└── Lab9_DataSeeding/
```

---

## Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)
- [SQL Server 2019+](https://www.microsoft.com/en-us/sql-server) (local or remote)
- `dotnet-ef` global tool:

```bash
dotnet tool install -g dotnet-ef
```

---

## How to Run

### 1. Configure Connection String

In each lab's `AppDbContext.cs`, update the connection string:

```csharp
optionsBuilder.UseSqlServer(
    "Server=.;Database=EFCoreLabsDb;Trusted_Connection=True;TrustServerCertificate=True");
```

### 2. Run Migrations (Lab 3+)

```bash
cd "Lab3_Migrations"
dotnet ef migrations add InitialCreate
dotnet ef database update
```

### 3. Run a Lab

```bash
cd "Lab4_InsertData"
dotnet restore
dotnet run
```

---

## Entity Model

```
Category
  │  Id (PK)
  │  Name
  │
  ├──► Product
           Id (PK)
           Name
           Price
           StockQuantity
           CategoryId (FK → Category)
```

---

*Part of CTS Deep Skilling — Week 2 Entity Framework Core Module*
