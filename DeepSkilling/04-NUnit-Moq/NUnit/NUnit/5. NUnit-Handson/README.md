# NUnit Handson 5 — Collections & CollectionAssert

> **Week 1 · CTS Deep Skilling · NUnit Testing**

## Overview

Demonstrates **collection-oriented assertions** using `CollectionAssert` on a list of `Employee` objects managed by `EmployeeManager`. Verifies properties such as null-safety, uniqueness, and collection equality.

### Learning Objectives
- Use `CollectionAssert.AllItemsAreNotNull()` to validate no nulls
- Use `CollectionAssert.AllItemsAreUnique()` — requires `Equals()` + `GetHashCode()` override
- Use `CollectionAssert.AreEqual()` for ordered collection comparison
- Contrast with the constraint model: `Assert.That(list, Is.EqualTo(...))`

---

## Technologies Used

| Technology | Version |
|------------|----------|
| C# / .NET | 10.0 |
| NUnit | 4.2.2 |
| NUnit3TestAdapter | 4.6.0 |
| Microsoft.NET.Test.Sdk | 17.11.1 |

---

## Folder Structure

```
5. NUnit-Handson/
├── CollectionsLib/
│   ├── CollectionsLib.csproj
│   ├── Employee.cs         # Entity with Id, Name; overrides Equals/GetHashCode
│   └── EmployeeManager.cs  # GetEmployees(), GetEmployeesWhoJoinedInPreviousYears()
└── CollectionsLib.Tests/
    ├── CollectionsLib.Tests.csproj
    ├── EmployeeManagerTests.cs
    └── GlobalUsings.cs     # CollectionAssert alias for NUnit 4.x
```

---

## How to Run

```bash
cd "week 1/NUnit/NUnit/5. NUnit-Handson"
dotnet restore && dotnet test CollectionsLib.Tests/CollectionsLib.Tests.csproj
```

**Expected:** 4/4 tests pass.

---

## Test Cases

| Test | Assertion Used |
|------|---------------|
| `GetEmployees_NoNullValues_ReturnsTrue` | `CollectionAssert.AllItemsAreNotNull()` |
| `GetEmployees_Employee100Exists_ReturnsTrue` | `Assert.That(employees.Any(...), Is.True)` |
| `GetEmployees_AllEmployeesUnique_ReturnsTrue` | `CollectionAssert.AllItemsAreUnique()` |
| `GetEmployees_CollectionsAreEqual_ReturnsTrue` | `CollectionAssert.AreEqual()` + `Assert.That(Is.EqualTo())` |

---

> **NUnit 4.x Note:** `CollectionAssert` was moved to `NUnit.Framework.Legacy` in NUnit 4. The `GlobalUsings.cs` file in this project provides the compatibility alias automatically.

---

*Part of CTS Deep Skilling — Week 1 NUnit Testing Module*
