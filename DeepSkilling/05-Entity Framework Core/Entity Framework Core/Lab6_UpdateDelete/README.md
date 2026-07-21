# Lab 6 — Update & Delete

> **Week 2 · CTS Deep Skilling · Entity Framework Core**

## Overview

Demonstrates how to modify and remove records from SQL Server using EF Core's `Update()` and `Remove()` methods.

### Learning Objectives

- Retrieve a tracked entity and modify its properties
- Call `context.SaveChanges()` to persist updates
- Use `context.Remove(entity)` to delete a record
- Understand the difference between tracked and untracked entities
- Use `ExecuteUpdate()` and `ExecuteDelete()` for bulk operations (EF Core 7+)

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
Lab6_UpdateDelete/
├── Lab6_UpdateDelete.csproj
├── AppDbContext.cs
├── Category.cs
├── Product.cs
└── Program.cs          # Update and delete examples
```

---

## How to Run

```bash
cd "week 2/Entity Framework Core/Lab6_UpdateDelete"
dotnet restore
dotnet run
```

---

*Part of CTS Deep Skilling — Week 2 EF Core Module*
