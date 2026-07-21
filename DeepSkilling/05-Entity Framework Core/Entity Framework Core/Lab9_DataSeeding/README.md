# Lab 9 — Data Seeding

> **Week 2 · CTS Deep Skilling · Entity Framework Core**

## Overview

Demonstrates how to seed initial (default) data into database tables using EF Core's `HasData()` configuration API so that required data is always present after migrations are applied.

### Learning Objectives

- Use `modelBuilder.Entity<T>().HasData(...)` in `OnModelCreating`
- Understand when seeding runs (on migration apply)
- Seed related entities respecting foreign key constraints
- Distinguish between seeding and manual data insertion

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
Lab9_DataSeeding/
├── Lab9_DataSeeding.csproj
└── Program.cs
```

---

## How to Run

```bash
cd "week 2/Entity Framework Core/Lab9_DataSeeding"
dotnet restore

# Seed data is applied via migration:
dotnet ef migrations add SeedInitialData
dotnet ef database update

dotnet run
```

---

## Code Pattern

```csharp
protected override void OnModelCreating(ModelBuilder modelBuilder)
{
    modelBuilder.Entity<Category>().HasData(
        new Category { Id = 1, Name = "Electronics" },
        new Category { Id = 2, Name = "Clothing" }
    );
}
```

---

*Part of CTS Deep Skilling — Week 2 EF Core Module*
