# NUnit Handson 3 — URL Hostname Parser

> **Week 1 · CTS Deep Skilling · NUnit Testing**

## Overview

Tests the `UrlHostNameParser.ParseHostName()` utility, which extracts the hostname from a URL string. Focuses on **edge-case** and **boundary** testing:

- Valid HTTP and HTTPS URLs
- Missing protocol prefix
- Null or empty input
- Malformed URLs

### Learning Objectives
- Test a string-processing utility with multiple input scenarios
- Validate that edge cases (null, empty, missing protocol) return expected "safe" defaults
- Use `[TestCase]` with string inputs

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
3. NUnit-Handson/
├── UtilLib/
│   ├── UtilLib.csproj
│   └── UrlHostNameParser.cs    # ParseHostName(url) method
└── UtilLib.Tests/
    ├── UtilLib.Tests.csproj
    └── UrlHostNameParserTests.cs
```

---

## How to Run

```bash
cd "week 1/NUnit/NUnit/3. NUnit-Handson"
dotnet restore && dotnet test UtilLib.Tests/UtilLib.Tests.csproj
```

**Expected:** 4/4 tests pass.

---

## Test Scenarios

| Input | Expected Output |
|-------|-----------------|
| `https://www.google.com/search?q=nunit` | `www.google.com` |
| `http://stackoverflow.com` | `stackoverflow.com` |
| `www.google.com` (no protocol) | `""` (empty string) |
| `null` or `""` | `""` (empty string) |

---

*Part of CTS Deep Skilling — Week 1 NUnit Testing Module*
