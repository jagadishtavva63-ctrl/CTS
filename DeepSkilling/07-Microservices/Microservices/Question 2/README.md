# Question 2 — Extended JWT Authentication Microservice

> **Week 4 · CTS Deep Skilling · Microservices**

## Overview

An extended version of the JWT Authentication Microservice from Question 1. Builds on the same authentication architecture with additional features and configurations — demonstrating how microservice authentication patterns can be extended for real-world scenarios.

### Learning Objectives

- Reinforce JWT token generation and validation in a microservice context
- Extend the authentication model with additional claims or validation logic
- Understand how multiple microservices can share the same JWT signing configuration
- Practice the complete login → token → protected-resource flow independently

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
Question 2/
├── JWTAuthentication_Q2.csproj
├── Program.cs                      # JWT middleware pipeline
├── appsettings.json                # Jwt:Key, Jwt:Issuer, Jwt:Audience, DurationInMinutes
├── Controllers/
│   ├── AuthController.cs           # POST /api/auth/login → JWT token
│   └── SecureController.cs         # GET /api/secure → [Authorize]
└── Models/
    ├── LoginModel.cs               # { Username, Password }
    └── User.cs
```

---

## Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)

---

## How to Run

```bash
cd "week 4/Microservices/Question 2"
dotnet restore
dotnet build
dotnet run
```

Open Swagger UI at the URL shown in the terminal output.

---

## API Endpoints

| Method | Route | Auth Required | Description |
|--------|-------|:---:|-------------|
| `POST` | `/api/auth/login` | ❌ | Submit credentials → receive JWT |
| `GET` | `/api/secure` | ✅ Bearer JWT | Access protected resource |

---

## Authentication Flow

```
POST /api/auth/login
Body: { "username": "admin", "password": "admin123" }
────────────────────────────────────────────────
Response: { "token": "eyJhbGciOiJIUzI1NiIs..." }

GET /api/secure
Authorization: Bearer eyJhbGciOiJIUzI1NiIs...
────────────────────────────────────────────────
Response 200 OK: Protected content

GET /api/secure (no token)
────────────────────────────────────────────────
Response 401 Unauthorized
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

---

## Comparison with Question 1

| Feature | Question 1 | Question 2 |
|---------|-----------|-----------|
| Login endpoint | `POST /api/auth/login` | `POST /api/auth/login` |
| Secure endpoint | `GET /api/secure` | `GET /api/secure` |
| JWT signing | HMAC-SHA256 | HMAC-SHA256 |
| Token claims | `ClaimTypes.Name` | Extended claims |
| Extended config | Basic | Additional validation |

---

*Part of CTS Deep Skilling — Week 4 Microservices Module*
