# NUnit Handson 2 — Math Library

> **Week 1 · CTS Deep Skilling · NUnit Testing**

## Overview

Builds on Handson 1 by introducing the complete test lifecycle and exception testing. The `MathLibrary` class provides arithmetic operations (add, subtract, multiply, divide) and an internal result accumulator.

### Learning Objectives
- Use `[SetUp]` and `[TearDown]` for test lifecycle management
- Test that exceptions are thrown correctly using `try/catch` with `Assert.Fail()`
- Apply `[TestCase]` for multiple arithmetic scenarios
- Use `ClassicAssert.AreEqual()` (NUnit 4.x legacy API)

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
2. NUnit-Handson/
├── MathLibrary/
│   ├── MathLibrary.csproj    # Class library
│   └── MathLibrary.cs        # Addition, Subtraction, Multiplication, Division + accumulator
└── MathLibrary.Tests/
    ├── MathLibrary.Tests.csproj
    ├── MathLibraryTests.cs   # Parameterised tests + exception tests
    └── GlobalUsings.cs       # NUnit.Framework.Legacy global using
```

---

## Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)

---

## How to Run

```bash
cd "week 1/NUnit/NUnit/2. NUnit-Handson"
dotnet restore
dotnet build
dotnet test MathLibrary.Tests/MathLibrary.Tests.csproj
```

### Expected Output

```
Test Run Successful.
Total tests: 10
     Passed: 10
```

---

## NUnit Concepts Demonstrated

| Attribute / Method | Purpose |
|--------------------|---------|
| `[SetUp]` | Runs before each test — instantiates `MathLibrary` |
| `[TearDown]` | Runs after each test — sets instance to null |
| `[TestCase(a, b, expected)]` | Data-driven parameterised test |
| `Assert.Fail()` | Forces a test failure (used in exception testing) |
| `ClassicAssert.AreEqual()` | Classic-style equality assertion (NUnit 4 compatibility) |
| `ClassicAssert.IsInstanceOf<T>()` | Asserts an object is of a given type |

---

## Test Cases

| Test | Operations | Cases |
|------|-----------|-------|
| `TestSubtraction` | `a - b == expected` | 3 cases |
| `TestMultiplication` | `a * b == expected` | 3 cases |
| `TestDivision` | `a / b == expected` | 2 cases |
| `TestDivisionByZero` | Division by 0 throws `ArgumentException` | 1 case |
| `TestAddAndClear` | Add then AllClear resets accumulator | 1 case |

---

*Part of CTS Deep Skilling — Week 1 NUnit Testing Module*
