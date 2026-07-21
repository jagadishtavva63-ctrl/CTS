# NUnit Handson 8 — User Manager (PAN Card Validation)

> **Week 1 · CTS Deep Skilling · NUnit Testing**

## Overview

Tests the `UserManager.CreateUser(user)` method which validates a PAN (Permanent Account Number) card before creating a user. Demonstrates testing with **multiple exception types** and **format validation**.

### Learning Objectives
- Test `NullReferenceException` for null/missing required fields
- Test `FormatException` for incorrect-length PAN card numbers
- Test the happy path (valid 10-character PAN)
- Use `Assert.Throws<T>()` with exception message validation

---

## Technologies Used

| Technology | Version |
|------------|---------|
| C# / .NET | 10.0 |
| NUnit | 4.2.2 |
| NUnit3TestAdapter | 4.6.0 |
| Microsoft.NET.Test.Sdk | 17.11.1 |

---

## Folder Structure

```
8. NUnit-Handson/
├── UserManagerLib/
│   ├── UserManagerLib.csproj
│   ├── User.cs           # Model with PANCardNo property
│   └── UserManager.cs    # CreateUser(user) → validates PAN card
└── UserManagerLib.Tests/
    ├── UserManagerLib.Tests.csproj
    └── UserManagerTests.cs
```

---

## How to Run

```bash
cd "week 1/NUnit/NUnit/8. NUnit-Handson"
dotnet restore && dotnet test UserManagerLib.Tests/UserManagerLib.Tests.csproj
```

**Expected:** 4/4 tests pass.

---

## Test Scenarios

| Test | Input | Expected |
|------|-------|----------|
| Null user | `null` | `NullReferenceException` |
| Null PAN card | `new User { PANCardNo = null }` | `NullReferenceException` |
| Short PAN (9 chars) | `"ABCDE1234"` | `FormatException` |
| Valid PAN (10 chars) | `"ABCDE1234F"` | `"User Created Successfully"` |

---

*Part of CTS Deep Skilling — Week 1 NUnit Testing Module*
