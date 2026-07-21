# Lab 2 — DbContext Setup

> **Week 2 · CTS Deep Skilling · Entity Framework Core**

## Overview

Demonstrates how to create and configure a `DbContext` with entity models. Defines the `Product` and `Category` entities and connects them to a SQL Server database using EF Core.

### Learning Objectives

- Create a `DbContext` subclass (`AppDbContext`)
- Define entity classes with properties and data annotations
- Configure a `DbSet<T>` for each entity
- Set up the SQL Server connection string via `OnConfiguring`
- Understand the relationship between entities and database tables

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
Lab2_DbContext/
├── Lab2_DbContext.csproj
├── AppDbContext.cs         # DbContext with DbSet<Product> and DbSet<Category>
├── Category.cs             # Category entity (Id, Name)
├── Product.cs              # Product entity (Id, Name, Price, StockQuantity, CategoryId)
└── Program.cs
```

---

## Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)
- SQL Server (local or remote)

---

## How to Run

```bash
cd "week 2/Entity Framework Core/Lab2_DbContext"
```

1. Update the connection string in `AppDbContext.cs`:

```csharp
optionsBuilder.UseSqlServer(
    "Server=.;Database=EFLabsDb;Trusted_Connection=True;TrustServerCertificate=True");
```

2. Run:

```bash
dotnet restore
dotnet build
dotnet run
```

---

*Part of CTS Deep Skilling — Week 2 EF Core Module*
