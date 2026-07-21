# Moq — Mocking Framework Hands-On

> **Week 1 · CTS Deep Skilling · .NET Testing Track**

## Overview

This project demonstrates how to use the **Moq** mocking framework alongside **NUnit** to write isolated, deterministic unit tests. The system under test is `CustomerComm` — a class that sends emails to customers using an `IMailSender` dependency.

By mocking `IMailSender`, tests verify the business logic of `CustomerComm` without sending real emails or requiring an SMTP server.

### Learning Objectives

- Understand the role of **mocking** in unit testing
- Create mock objects using `Mock<T>`
- Configure mock behaviour with `Setup()` and `Returns()`
- Use argument matchers (`It.IsAny<T>()`, specific values)
- Verify method calls with `Verify()` and `Times`
- Apply `[SetUp]`, `[OneTimeSetUp]`, `[TearDown]`, `[OneTimeTearDown]` lifecycle attributes

---

## Technologies Used

| Technology | Version | Purpose |
|------------|---------|----------|
| C# / .NET | 10.0 | Language & runtime |
| NUnit | 4.2.2 | Test framework |
| Moq | 4.20.72 | Mocking framework |
| NUnit3TestAdapter | 4.6.0 | VS / CLI test runner adapter |
| Microsoft.NET.Test.Sdk | 17.11.1 | Test host infrastructure |

---

## Folder Structure

```
Moq/
├── CustomerCommLib/
│   ├── CustomerCommLib.csproj    # Class library
│   ├── CustomerComm.cs           # System under test
│   ├── IMailSender.cs            # Interface to be mocked
│   └── MailSender.cs             # Real implementation (unused in tests)
├── CustomerComm.Tests/
│   ├── CustomerComm.Tests.csproj # Test project
│   └── CustomerCommTests.cs      # NUnit + Moq test class
└── CustomerComm.sln              # Solution file
```

---

## Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)
- Visual Studio 2022 **or** VS Code with C# Dev Kit extension

---

## How to Run

### Restore & Build

```bash
cd "week 1/Moq"
dotnet restore
dotnet build
```

### Run Tests

```bash
dotnet test CustomerComm.sln
```

### Run Tests with Detailed Output

```bash
dotnet test CustomerComm.sln --logger "console;verbosity=normal"
```

### Expected Output

```
Test Run Successful.
Total tests: 4
     Passed: 4
 Total time: ~4 Seconds
```

---

## Key Moq Concepts Demonstrated

| Concept | Code Pattern |
|---------|--------------|
| Create a mock | `var mock = new Mock<IMailSender>()` |
| Setup return value | `mock.Setup(m => m.Send(It.IsAny<string>())).Returns(true)` |
| Setup specific argument | `mock.Setup(m => m.Send("test@mail.com")).Returns(true)` |
| Verify was called | `mock.Verify(m => m.Send(It.IsAny<string>()), Times.Once)` |
| Inject mock into SUT | `new CustomerComm(mock.Object)` |
| Never-throw guarantee | Mock never throws unless explicitly configured |

---

## Test Cases

| Test Name | What It Verifies |
|-----------|------------------|
| `SendMailToCustomer_MockNeverThrows_NoRealEmailSent` | No real email is sent; mock absorbs the call |
| `SendMailToCustomer_MockSetupWithSpecificArgs_ReturnsTrue` | Returns `true` for a specific email address |
| `SendMailToCustomer_WhenCalled_InvokesMailSenderExactlyOnce` | `IMailSender.Send()` is called exactly once |
| `SendMailToCustomer_WhenCalled_ReturnsTrue` | Method returns `true` on success |

---

## Architecture

```
CustomerComm (SUT)
    │
    └── depends on ──► IMailSender
                            │
                    ┌───────┴──────────┐
                    │                  │
              MailSender          Mock<IMailSender>
           (real, production)    (fake, used in tests)
```

---

*Part of CTS Deep Skilling — Week 1 Testing Module*
