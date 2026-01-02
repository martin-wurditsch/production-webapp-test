# Optimizer API - Backend

Spring Boot REST API für Energie-Management-System auf Edge-Geräten.

## Tech Stack

- **Java 25** (LTS)
- **Spring Boot 3.5.9** (mit Java 25 Support)
- **springdoc-openapi 2.8.15** (OpenAPI 3 / Swagger UI)
- **Lombok 1.18.36**
- **Maven 3.x**

## Prerequisites

- Java 25 JDK installiert
- Maven 3.x installiert
- IDE (IntelliJ IDEA empfohlen)

## Build

```bash
cd backend
mvn clean install
```

## Run

```bash
mvn spring-boot:run
```

Anwendung läuft auf: `http://localhost:8080`

## API Documentation

Swagger UI: `http://localhost:8080/swagger-ui.html`
OpenAPI Spec: `http://localhost:8080/v3/api-docs`

## Package-Struktur (Feature-based)

```
de.company.optimizer.api/
├── OptimizerApiApplication.java    # Main Entry Point
├── shared/                          # Shared Infrastructure
│   ├── config/                      # Configuration Classes
│   └── exception/                   # Global Exception Handling
└── health/                          # Health Check Feature
    ├── controller/                  # REST Controllers
    └── dto/                         # Data Transfer Objects
```

### Prinzipien

- **Feature-basiert**: Code ist nach Features organisiert (nicht nach Layern)
- **Shared Module**: Wiederverwendbare Komponenten (Exception Handling, Config)
- **DTOs als Records**: Immutable Data Transfer Objects (Java 17+ Feature)

## Testing

```bash
mvn test
```

## Projekt-Status

Minimales Grundgerüst mit:
- ✅ Spring Boot 3.4.1 Setup
- ✅ OpenAPI / Swagger Integration
- ✅ Global Exception Handling
- ✅ Health Check Endpoint (Beispiel-Feature)
