# Microservices — JWT Authentication

> **Week 4 · CTS Deep Skilling · Microservices Track**

## Overview

Two standalone microservice projects demonstrating **JWT Bearer authentication** as self-contained ASP.NET Core APIs. Each project represents an independently deployable service with its own authentication endpoint and a protected resource endpoint — the foundation of a microservices security pattern.

| Project | Description |
|---------|-------------|
| [Question 1 — JWT Authentication](Question%201_JWTAuthentication/) | JWT login + protected endpoint (basic implementation) |
| [Question 2 — Extended JWT](Question%202/) | Extended JWT microservice with additional features |

---

## Technologies Used

| Technology | Version | Purpose |
|------------|---------|---------|
| C# / .NET | 10.0 | Language & runtime |
| ASP.NET Core | 10.0 | Microservice web framework |
| Microsoft.AspNetCore.Authentication.JwtBearer | 10.0 | JWT validation middleware |
| System.IdentityModel.Tokens.Jwt | 8.4.0 | Token generation & parsing |
| Swashbuckle.AspNetCore | 7.2.0 | API documentation |

---

## Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)
- Visual Studio 2022 **or** VS Code with C# Dev Kit

---

## Quick Start

```bash
# Question 1
cd "week 4/Microservices/Question 1_JWTAuthentication"
dotnet restore
dotnet run

# Question 2
cd "week 4/Microservices/Question 2"
dotnet restore
dotnet run
```

---

## Microservice Architecture Pattern

```
Client
  │
  ├──POST /api/auth/login ──▶ Auth Microservice ──▶ Returns JWT Token
  │
  └──GET  /api/secure     ──▶ Secure Microservice (validates JWT) ──▶ 200 OK
         Authorization: Bearer <token>
```

---

## JWT Configuration (`appsettings.json`)

Both services share the same JWT configuration structure:

```json
{
  "Jwt": {
    "Key": "ThisIsASecretKeyForJwtToken",
    "Issuer": "MyAuthServer",
    "Audience": "MyApiUsers",
    "DurationInMinutes": 60
  }
}
```

> ⚠️ **Production Note**: Use a secrets manager (Azure Key Vault, AWS Secrets Manager, or `dotnet user-secrets`) instead of storing keys in `appsettings.json`.

---

## Verified Build Status

| Project | Build | Status |
|---------|-------|--------|
| Question 1 — JWTAuthentication | `dotnet build` | ✅ 0 errors |
| Question 2 — Extended JWT | `dotnet build` | ✅ 0 errors |

---

*Part of CTS Deep Skilling — Week 4 Microservices Module*
