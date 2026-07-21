# Lab 8 — Schema Changes

> **Week 2 · CTS Deep Skilling · Entity Framework Core**

## Overview

Demonstrates how to evolve a database schema using additional EF Core migrations. Shows how to add a new column to an existing table without losing data.

### Learning Objectives

- Add a property to an existing entity class
- Create a new migration for the schema change
- Apply the migration to update the database
- Understand how EF Core generates `ALTER TABLE` SQL from migrations
- Handle nullable vs non-nullable column additions safely

---

## Technologies Used

| Technology | Version |
|------------|----------|
| C# / .NET | 10.0 |
| Entity Framework Core | 9.0.7 |
| EF Core SQL Server | 9.0.7 |
| EF Core Design Tools | 9.0.7 |
| SQL Server | 2019+ |

---

## Folder Structure

```
Lab8_SchemaChanges/
├── Lab8_SchemaChanges.csproj
└── Program.cs
```

---

## How to Run

```bash
cd "week 2/Entity Framework Core/Lab8_SchemaChanges"
dotnet restore

# After modifying an entity, add a migration:
dotnet ef migrations add AddDescriptionToProduct

# Apply to database:
dotnet ef database update

# Run:
dotnet run
```

---

*Part of CTS Deep Skilling — Week 2 EF Core Module*
