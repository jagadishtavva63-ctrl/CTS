# WebApi Handson 5 — JWT Authentication

> **Week 2 · CTS Deep Skilling · ASP.NET Core Web API**

## Overview

Implements **JSON Web Token (JWT) Bearer authentication** in an ASP.NET Core Web API. A client first calls the `AuthController` to receive a signed JWT, then supplies it as a `Bearer` token in the `Authorization` header to access protected endpoints.

### Learning Objectives

- Configure JWT Bearer authentication middleware in `Program.cs`
- Generate a signed JWT with `JwtSecurityTokenHandler` using HMAC-SHA256
- Embed user identity and role as **claims** inside the token payload
- Protect controller actions with `[Authorize]`
- Allow public access with `[AllowAnonymous]`
- Externalise JWT settings (key, issuer, audience) to `appsettings.json`

---

## Technologies Used

| Technology | Version | Purpose |
|------------|---------|---------|
| C# / .NET | 10.0 | Language & runtime |
| ASP.NET Core | 10.0 | Web framework |
| Microsoft.AspNetCore.Authentication.JwtBearer | 10.0 | JWT validation middleware |
| System.IdentityModel.Tokens.Jwt | 8.4.0 | Token generation & parsing |
| Swashbuckle.AspNetCore | 7.2.0 | Swagger UI |

---

## Folder Structure

```
WebApi_Handson5/
├── WebApi_Handson5.csproj
├── Program.cs                      # AddAuthentication / AddJwtBearer / UseAuthorization
├── appsettings.json                # Jwt:Key, Jwt:Issuer, Jwt:Audience, DurationInMinutes
├── Properties/
│   └── launchSettings.json
├── Controllers/
│   ├── AuthController.cs           # [AllowAnonymous] GET /api/auth → returns JWT
│   └── EmployeeController.cs       # [Authorize] protected endpoints
└── Models/
    └── Employee.cs
```

---

## Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)

---

## How to Run

```bash
cd "week 2/webApi/WebApi_Handson5"
dotnet restore
dotnet build
dotnet run
```

Open Swagger UI: **http://localhost:5000/swagger**

---

## Authentication Flow

```
Step 1 — Get Token (no auth required):
  GET /api/auth
  ─────────────────────────────────────
  Response 200: "eyJhbGciOiJIUzI1NiIs..."

Step 2 — Call Protected Endpoint:
  GET /api/employee
  Authorization: Bearer eyJhbGciOiJIUzI1NiIs...
  ─────────────────────────────────────
  Response 200: [ { "id": 1, "name": "Alice" }, ... ]

Step 3 — Without Token:
  GET /api/employee
  ─────────────────────────────────────
  Response 401: Unauthorized
```

---

## Configuration (`appsettings.json`)

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

> ⚠️ **Security Note:** Replace `Key` with a strong random secret (≥ 32 characters) in production. Never commit secrets to source control — use environment variables or a secrets manager.

---

## JWT Token Structure

```
Header:  { "alg": "HS256", "typ": "JWT" }
Payload: { "userId": 101, "role": "Admin", "exp": 1234567890 }
Signature: HMAC-SHA256(base64(header) + "." + base64(payload), key)
```

---

*Part of CTS Deep Skilling — Week 2 Web API Module*
