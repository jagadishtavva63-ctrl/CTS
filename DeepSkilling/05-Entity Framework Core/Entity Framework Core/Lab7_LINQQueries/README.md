# Lab 7 — LINQ Queries

> **Week 2 · CTS Deep Skilling · Entity Framework Core**

## Overview

Demonstrates how to use LINQ (Language-Integrated Query) with EF Core to write expressive, strongly-typed database queries that are translated to SQL automatically.

### Learning Objectives

- Use `Where()` for filtered queries
- Use `OrderBy()` and `OrderByDescending()` for sorting
- Use `Select()` for projection to DTOs
- Use `Join()` for multi-table queries
- Use `GroupBy()` for aggregation
- Understand how LINQ is translated to SQL via EF Core

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
Lab7_LINQQueries/
├── Lab7_LINQQueries.csproj
├── AppDbContext.cs
├── Category.cs
├── Product.cs
└── Program.cs          # Various LINQ query examples
```

---

## How to Run

```bash
cd "week 2/Entity Framework Core/Lab7_LINQQueries"
dotnet restore
dotnet run
```

---

## Sample Queries Demonstrated

```csharp
// Filter products by price
var expensive = context.Products.Where(p => p.Price > 100).ToList();

// Order by name
var sorted = context.Products.OrderBy(p => p.Name).ToList();

// Project to anonymous type
var names = context.Products.Select(p => new { p.Name, p.Price }).ToList();

// Join with Category
var joined = context.Products
    .Join(context.Categories, p => p.CategoryId, c => c.Id,
          (p, c) => new { p.Name, Category = c.Name })
    .ToList();
```

---

*Part of CTS Deep Skilling — Week 2 EF Core Module*
