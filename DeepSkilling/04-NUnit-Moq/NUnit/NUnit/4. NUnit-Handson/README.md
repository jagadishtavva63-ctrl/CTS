# NUnit Handson 4 — Accounts Manager

> **Week 1 · CTS Deep Skilling · NUnit Testing**

## Overview

Tests the `AccountsManager.Login()` method, which validates user credentials and throws exceptions on invalid input. Emphasises **exception testing** with `Assert.Throws<T>()` and **multiple test scenarios** with `[TestCase]`.

### Learning Objectives
- Use `Assert.Throws<ArgumentException>()` for exception-path testing
- Test multiple valid and invalid login scenarios
- Verify return values for successful authentication
- Test null/empty input validation

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
4. NUnit-Handson/
├── AccountsManagerLib/
│   ├── AccountsManagerLib.csproj
│   └── AccountsManager.cs      # Login(userId, password) method
└── AccountsManagerLib.Tests/
    ├── AccountsManagerLib.Tests.csproj
    └── AccountsManagerTests.cs # Exception & success scenario tests
```

---

## How to Run

```bash
cd "week 1/NUnit/NUnit/4. NUnit-Handson"
dotnet restore && dotnet test AccountsManagerLib.Tests/AccountsManagerLib.Tests.csproj
```

**Expected:** 7/7 tests pass.

---

## Test Scenarios

| Test | Input | Expected |
|------|-------|----------|
| Valid login | `user_11` / `secret@user11` | `"Welcome user_11!!!"` |
| Wrong password | `user_11` / `wrongpass` | `"Invalid credentials"` |
| Empty userId | `""` / `"secret"` | `ArgumentException` thrown |
| Null password | `"user_11"` / `null` | `ArgumentException` thrown |
| Empty both | `""` / `""` | `ArgumentException` thrown |

---

## NUnit Concepts

| Feature | Use |
|---------|-----|
| `Assert.Throws<T>()` | Asserts a specific exception is thrown |
| `[TestCase]` | Multiple input scenarios in one test method |
| `Assert.That(result, Is.EqualTo(...))` | Constraint-based assertion |

---

*Part of CTS Deep Skilling — Week 1 NUnit Testing Module*
