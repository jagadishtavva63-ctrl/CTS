# NUnit Handson 1 — Calculator Library

> **Week 1 · CTS Deep Skilling · NUnit Testing**

## Overview

Introductory NUnit lab using a simple `Calculator` class that performs addition. Demonstrates:
- `[TestFixture]` — marking a class as a test container
- `[TestCase]` — parameterized/data-driven tests with multiple input sets
- `[Ignore]` — skipping a test with a reason
- `[Test]` — individual test method
- `Assert.That()` with `Is.EqualTo()` constraints

### Learning Objectives
- Set up a class library and a separate test project
- Write parameterized tests using `[TestCase]`
- Demonstrate the `[Ignore]` attribute to skip a test
- Use `Assert.That()` with the constraint model

---

## Technologies Used

| Technology | Version | Purpose |
|------------|---------|----------|
| C# / .NET | 10.0 | Language & runtime |
| NUnit | 4.2.2 | Test framework |
| NUnit3TestAdapter | 4.6.0 | Test runner adapter |
| Microsoft.NET.Test.Sdk | 17.11.1 | Test host infrastructure |

---

## Folder Structure

```
1. NUnit-Handson/
├── CalcLibrary/
│   ├── CalcLibrary.csproj      # Class library project
│   └── Calculator.cs           # Calculator class with Addition()
└── CalcLibrary.Tests/
    ├── CalcLibrary.Tests.csproj # Test project
    └── CalculatorTests.cs       # [TestCase] & [Ignore] tests
```

---

## Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)
- Visual Studio 2022 **or** VS Code with C# Dev Kit

---

## How to Run

```bash
cd "week 1/NUnit/NUnit/1. NUnit-Handson"
dotnet restore
dotnet build
dotnet test CalcLibrary.Tests/CalcLibrary.Tests.csproj
```

### Expected Output

```
Test Run Successful.
Total tests: 5
     Passed: 4
    Skipped: 1
Total time: ~1 Second
```

---

## NUnit Attributes Used

| Attribute | Purpose |
|-----------|---------|
| `[TestFixture]` | Marks class as NUnit test container |
| `[Test]` | Marks a method as a test |
| `[TestCase(a, b, expected)]` | Parameterised test — runs once per set of arguments |
| `[Ignore("reason")]` | Skips a test and reports it as skipped |
| `Assert.That(actual, Is.EqualTo(expected))` | Fluent constraint assertion |

---

## Test Cases

| Test | Inputs | Expected |
|------|--------|----------|
| `Addition_ReturnsExpectedResult` | (10, 20) | 30 |
| `Addition_ReturnsExpectedResult` | (15, 25) | 40 |
| `Addition_ReturnsExpectedResult` | (-5, 10) | 5 |
| `Addition_ReturnsExpectedResult` | (0, 0) | 0 |
| `Ignored_Test` | — | Skipped (`[Ignore]`) |

---

*Part of CTS Deep Skilling — Week 1 NUnit Testing Module*
