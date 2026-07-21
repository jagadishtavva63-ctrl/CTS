# NUnit Handson 7 — Leap Year Calculator

> **Week 1 · CTS Deep Skilling · NUnit Testing**

## Overview

Tests the `LeapYearCalculator.CheckLeapYear(year)` method with **boundary value analysis** and **equivalence partitioning**. The method returns:
- `1` → leap year
- `0` → non-leap year
- `-1` → year out of valid range (< 1753 or > 9999)

### Learning Objectives
- Apply **boundary value analysis** in test design
- Use `[TestCase]` with multiple expected results (`1`, `0`, `-1`)
- Test year range boundaries (1752, 1753, 9999, 10000)
- Validate the Gregorian calendar leap year rule: divisible by 4, except centuries, unless divisible by 400

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
7. NUnit-Handson/
├── LeapYearCalculatorLib/
│   ├── LeapYearCalculatorLib.csproj
│   └── LeapYearCalculator.cs    # CheckLeapYear(year) → int
└── LeapYearCalculatorLib.Tests/
    ├── LeapYearCalculatorLib.Tests.csproj
    └── LeapYearCalculatorTests.cs
```

---

## How to Run

```bash
cd "week 1/NUnit/NUnit/7. NUnit-Handson"
dotnet restore && dotnet test LeapYearCalculatorLib.Tests/LeapYearCalculatorLib.Tests.csproj
```

**Expected:** 8/8 tests pass.

---

## Test Scenarios

| Year | Expected | Reason |
|------|----------|--------|
| 2000 | 1 | Divisible by 400 → leap |
| 1900 | 0 | Divisible by 100 but not 400 → not leap |
| 2024 | 1 | Divisible by 4, not 100 → leap |
| 2023 | 0 | Not divisible by 4 → not leap |
| 1753 | 0 | Lower boundary (valid) |
| 1752 | -1 | Below lower boundary → invalid |
| 9999 | 0 | Upper boundary (valid) |
| 10000 | -1 | Above upper boundary → invalid |

---

*Part of CTS Deep Skilling — Week 1 NUnit Testing Module*
