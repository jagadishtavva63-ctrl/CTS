# Question 1 — JWT Authentication Microservice

> **Week 4 · CTS Deep Skilling · Microservices**

## Overview

A self-contained ASP.NET Core microservice implementing the complete **JWT Bearer authentication** flow. The service exposes:
- A public `POST /api/auth/login` endpoint that validates credentials and issues a signed JWT
- A protected `GET /api/secure` endpoint that requires a valid Bearer token

This pattern is the security foundation for microservice architectures where each service is independently deployable and stateless.

### Learning Objectives

- Build a standalone authentication microservice with ASP.NET Core
- Implement credential validation and JWT token generation with `JwtSecurityTokenHandler`
- Add user identity as **claims** (`ClaimTypes.Name`) inside the token
- Configure JWT validation parameters: `ValidIssuer`, `ValidAudience`, `IssuerSigningKey`, `ClockSkew`
- Protect resource endpoints with `[Authorize]`
- Test the complete flow via Swagger: login → copy token → authorise → call secure endpoint

---

## Technologies Used

| Technology | Version | Purpose |
|------------|---------|---------|
| C# / .NET | 10.0 | Language & runtime |
| ASP.NET Core | 10.0 | Microservice web framework |
| Microsoft.AspNetCore.Authentication.JwtBearer | 10.0 | JWT validation middleware |
| System.IdentityModel.Tokens.Jwt | 8.4.0 | Token creation |
| Swashbuckle.AspNetCore | 7.2.0 | Interactive API docs |

---

## Folder Structure

```
Question 1_JWTAuthentication/
├── JWTAuthentication.csproj
├── Program.cs                      # JWT middleware, AddAuthentication, UseAuthorization
├── appsettings.json                # Jwt:Key, Jwt:Issuer, Jwt:Audience, DurationInMinutes
├── Controllers/
│   ├── AuthController.cs           # POST /api/auth/login → { Token: "..." }
│   └── SecureController.cs         # GET /api/secure → [Authorize] protected data
└── Models/
    ├── LoginModel.cs               # { Username, Password }
    └── User.cs                     # User entity model
```

---

## Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)

---

## How to Run

```bash
cd "week 4/Microservices/Question 1_JWTAuthentication"
dotnet restore
dotnet build
dotnet run
```

Open Swagger UI at the URL shown in the terminal (typically `http://localhost:5000/swagger`).

---

## API Endpoints

| Method | Route | Auth Required | Description |
|--------|-------|:---:|-------------|
| `POST` | `/api/auth/login` | ❌ | Submit credentials → receive JWT token |
| `GET` | `/api/secure` | ✅ Bearer JWT | Access protected secure resource |

---

## Complete Authentication Flow

```
┌─────────────────────────────────────────────────────┐
│  STEP 1 — Login (no token required)                 │
│                                                     │
│  POST /api/auth/login                               │
│  Content-Type: application/json                     │
│  Body: { "username": "admin", "password": "admin123" } │
│                                                     │
│  Response 200:                                      │
│  { "token": "eyJhbGciOiJIUzI1NiIsInR5cCI..." }     │
└─────────────────────────────────────────────────────┘
                    │
                    ▼
┌─────────────────────────────────────────────────────┐
│  STEP 2 — Access Secure Endpoint                    │
│                                                     │
│  GET /api/secure                                    │
│  Authorization: Bearer eyJhbGciOiJIUzI1NiIs...     │
│                                                     │
│  Response 200: "Secure data accessed successfully"  │
└─────────────────────────────────────────────────────┘

                    ───── OR ─────

┌─────────────────────────────────────────────────────┐
│  Without Token / Expired Token                      │
│                                                     │
│  GET /api/secure (no Authorization header)          │
│                                                     │
│  Response 401: Unauthorized                         │
└─────────────────────────────────────────────────────┘
```

---

## Default Credentials

| Username | Password | Role |
|----------|----------|------|
| `admin` | `admin123` | Admin |

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

> ⚠️ **Security:** Replace `Key` with a strong 32+ character secret. Use environment variables or a secrets manager in production. Never commit secret keys to source control.

---

## Token Internals

```
JWT = Base64(Header) + "." + Base64(Payload) + "." + Signature

Header:   { "alg": "HS256", "typ": "JWT" }
Payload:  { "http://schemas.xmlsoap.org/ws/2005/05/identity/claims/name": "admin",
            "exp": 1234567890, "iss": "MyAuthServer", "aud": "MyApiUsers" }
Signature: HMAC-SHA256(header + payload, "ThisIsASecretKeyForJwtToken")
```

---

*Part of CTS Deep Skilling — Week 4 Microservices Module*
