# NUnit Handson 6 — Four Seasons (TestCaseSource)

> **Week 1 · CTS Deep Skilling · NUnit Testing**

## Overview

Demonstrates **`[TestCaseSource]`** — a powerful NUnit feature that loads test data from a separate static method or property, enabling clean separation of test logic from test data. The `SeasonManager.GetSeason(month)` method maps month names to seasons.

### Learning Objectives
- Use `[TestCaseSource]` to drive tests from a data source
- Separate test data from test methods for maintainability
- Validate a mapping function against multiple inputs
- Test boundary months (month shared between two seasons)

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
6. NUnit-Handson/
├── FourSeasonsLib/
│   ├── FourSeasonsLib.csproj
│   └── SeasonManager.cs      # GetSeason(month) → Spring/Summer/Autumn/Winter
└── FourSeasonsLib.Tests/
    ├── FourSeasonsLib.Tests.csproj
    └── SeasonManagerTests.cs  # [TestCaseSource] parameterised tests
```

---

## How to Run

```bash
cd "week 1/NUnit/NUnit/6. NUnit-Handson"
dotnet restore && dotnet test FourSeasonsLib.Tests/FourSeasonsLib.Tests.csproj
```

**Expected:** 11/11 tests pass.

---

## Season Mapping

| Month | Season |
|-------|--------|
| February, March | Spring |
| April, May, June | Summer |
| July, August, September | Autumn |
| October, November, December, January | Winter |

---

## Key Concept: `[TestCaseSource]`

```csharp
[TestCaseSource(nameof(SeasonTestData))]
public void GetSeason_ReturnsCorrectSeason(string month, string expectedSeason)
{
    Assert.That(manager.GetSeason(month), Is.EqualTo(expectedSeason));
}

static object[] SeasonTestData = { ... };
```

---

*Part of CTS Deep Skilling — Week 1 NUnit Testing Module*
