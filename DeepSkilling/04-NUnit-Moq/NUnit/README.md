# NUnit Hands-On Labs — Unit Testing with .NET

> **Week 1 · CTS Deep Skilling · .NET Testing Track**

## Overview

This folder contains **9 progressive NUnit hands-on labs**, each demonstrating a distinct unit-testing concept using the NUnit framework. Every lab follows a two-project structure: a **class library** (the code under test) and a **test project** (the NUnit assertions).

### Learning Objectives

- Write structured unit tests using NUnit attributes
- Apply test lifecycle methods (`[SetUp]`, `[TearDown]`, `[OneTimeSetUp]`)
- Use data-driven tests with `[TestCase]` and `[TestCaseSource]`
- Test exceptions, collections, and interfaces
- Use Moq to mock external dependencies

---

## Labs Summary

| # | Folder | Library | Concept |
|---|--------|---------|---------|
| 1 | `1. NUnit-Handson` | `CalcLibrary` | `[TestCase]`, `[Ignore]`, basic assertions |
| 2 | `2. NUnit-Handson` | `MathLibrary` | `[SetUp]`/`[TearDown]`, exception testing |
| 3 | `3. NUnit-Handson` | `UtilLib` | URL parsing, edge-case testing |
| 4 | `4. NUnit-Handson` | `AccountsManagerLib` | Exception assertions, multiple scenarios |
| 5 | `5. NUnit-Handson` | `CollectionsLib` | `CollectionAssert` — null, unique, equality |
| 6 | `6. NUnit-Handson` | `FourSeasonsLib` | `[TestCaseSource]` data-driven testing |
| 7 | `7. NUnit-Handson` | `LeapYearCalculatorLib` | Boundary value analysis |
| 8 | `8. NUnit-Handson` | `UserManagerLib` | PAN card validation, format exceptions |
| 9 | `9. NUnit-Handson` | `ConverterLib` | Moq interface mocking with NUnit |

---

## Technologies Used

| Technology | Version | Purpose |
|------------|---------|---------|
| C# / .NET | 10.0 | Language & runtime |
| NUnit | 4.2.2 | Test framework |
| NUnit3TestAdapter | 4.6.0 | Test runner adapter |
| Microsoft.NET.Test.Sdk | 17.11.1 | Test host infrastructure |
| Moq | 4.20.72 | Mocking (Handson 9 only) |

---

## Folder Structure

```
NUnit/
└── NUnit/
    ├── 1. NUnit-Handson/
    │   ├── CalcLibrary/           # Calculator class library
    │   └── CalcLibrary.Tests/     # [TestCase], [Ignore] tests
    ├── 2. NUnit-Handson/
    │   ├── MathLibrary/           # Math operations library
    │   └── MathLibrary.Tests/     # SetUp/TearDown, exceptions
    ├── 3. NUnit-Handson/
    │   ├── UtilLib/               # URL hostname parser
    │   └── UtilLib.Tests/         # Edge-case URL tests
    ├── 4. NUnit-Handson/
    │   ├── AccountsManagerLib/    # Login / accounts logic
    │   └── AccountsManagerLib.Tests/
    ├── 5. NUnit-Handson/
    │   ├── CollectionsLib/        # Employee collection manager
    │   └── CollectionsLib.Tests/  # CollectionAssert tests
    ├── 6. NUnit-Handson/
    │   ├── FourSeasonsLib/        # Season resolver
    │   └── FourSeasonsLib.Tests/  # TestCaseSource tests
    ├── 7. NUnit-Handson/
    │   ├── LeapYearCalculatorLib/ # Leap year logic
    │   └── LeapYearCalculatorLib.Tests/
    ├── 8. NUnit-Handson/
    │   ├── UserManagerLib/        # User creation / PAN validation
    │   └── UserManagerLib.Tests/
    └── 9. NUnit-Handson/
        ├── ConverterLib/          # USD → EUR converter (uses interface)
        └── ConverterLib.Tests/    # Moq mock of exchange rate feed
```

---

## Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)
- Visual Studio 2022 **or** VS Code with C# Dev Kit

---

## How to Run

### Run All Tests in a Specific Lab

```bash
cd "week 1/NUnit/NUnit/1. NUnit-Handson"
dotnet test CalcLibrary.Tests/CalcLibrary.Tests.csproj
```

### Run All Labs at Once

```bash
cd "week 1/NUnit/NUnit"
Get-ChildItem -Recurse -Filter "*.Tests.csproj" | ForEach-Object { dotnet test $_.FullName }
```

### Run with Verbose Output

```bash
dotnet test CalcLibrary.Tests/CalcLibrary.Tests.csproj --logger "console;verbosity=normal"
```

---

## Verified Test Results

| Lab | Tests | Result |
|-----|-------|--------|
| Handson 1 | 5 (4 pass, 1 skip) | ✅ |
| Handson 2 | 10/10 | ✅ |
| Handson 3 | 4/4 | ✅ |
| Handson 4 | 7/7 | ✅ |
| Handson 5 | 4/4 | ✅ |
| Handson 6 | 11/11 | ✅ |
| Handson 7 | 8/8 | ✅ |
| Handson 8 | 4/4 | ✅ |
| Handson 9 | 3/3 | ✅ |

---

*Part of CTS Deep Skilling — Week 1 Testing Module*
