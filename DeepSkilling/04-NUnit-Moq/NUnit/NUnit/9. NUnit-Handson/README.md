# NUnit Handson 9 — Currency Converter (Moq + Interface)

> **Week 1 · CTS Deep Skilling · NUnit Testing**

## Overview

Combines NUnit testing with **Moq** to unit-test the `Converter.USDToEuro()` method. The converter depends on an `IDollarToEuroExchangeRateFeed` interface to retrieve the current exchange rate.

By mocking the interface, tests control the exchange rate value precisely — no real exchange rate API calls are needed.

### Learning Objectives
- Mock an interface using `Mock<T>` in a Moq-free test project
- Control the return value of a mocked method with `Setup().Returns()`
- Test a calculation that depends on an external data source
- Understand **dependency injection via constructor** as a testability pattern

---

## Technologies Used

| Technology | Version | Purpose |
|------------|---------|---------|
| C# / .NET | 10.0 | Language & runtime |
| NUnit | 4.2.2 | Test framework |
| Moq | 4.20.72 | Mocking `IDollarToEuroExchangeRateFeed` |
| NUnit3TestAdapter | 4.6.0 | Test runner adapter |
| Microsoft.NET.Test.Sdk | 17.11.1 | Test host infrastructure |

---

## Folder Structure

```
9. NUnit-Handson/
├── ConverterLib/
│   ├── ConverterLib.csproj
│   ├── IDollarToEuroExchangeRateFeed.cs   # Interface
│   ├── DollarToEuroExchangeRateFeed.cs    # Real implementation (returns 0.85)
│   └── Converter.cs                        # USDToEuro(decimal) uses the interface
└── ConverterLib.Tests/
    ├── ConverterLib.Tests.csproj
    └── ConverterTests.cs                   # Moq-based tests
```

---

## Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)

---

## How to Run

```bash
cd "week 1/NUnit/NUnit/9. NUnit-Handson"
dotnet restore && dotnet test ConverterLib.Tests/ConverterLib.Tests.csproj
```

**Expected:** 3/3 tests pass.

---

## Key Design Pattern

```
Converter (SUT)
    │
    └── depends on ──► IDollarToEuroExchangeRateFeed
                            │
                    ┌───────┴───────────────────┐
                    │                           │
      DollarToEuroExchangeRateFeed     Mock<IDollarToEuro...>
       (real, returns 0.85)            (fake, returns any rate)
```

---

## Test Scenarios

| Test | Mock Rate | Input ($) | Expected (€) |
|------|-----------|-----------|--------------|
| `USDToEuro_WithRate085_ReturnsCorrectAmount` | 0.85 | 100 | 85.00 |
| `USDToEuro_WithRate09_ReturnsCorrectAmount` | 0.90 | 200 | 180.00 |
| `USDToEuro_WithZeroRate_ReturnsZero` | 0.00 | 500 | 0.00 |

---

*Part of CTS Deep Skilling — Week 1 NUnit Testing Module*
