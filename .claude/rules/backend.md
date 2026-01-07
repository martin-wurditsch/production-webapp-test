---
paths: backend/**/*.java, backend/**/*.kt
---

# Backend (Spring Boot 4.x)

## Stack
- Java 25 LTS, Spring Boot 4.x, Hibernate 7
- MariaDB mit mariadb-java-client 3.x
- Maven

## Wichtig
- Jakarta EE 11: Imports sind `jakarta.*` (nicht `javax.*`)
- Hibernate 7: Dialect automatisch erkannt
- Jackson 3.x: Breaking Changes bei Annotations

## DB-Config
```properties
spring.datasource.url=jdbc:mariadb://localhost:3306/ems
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
```

## Struktur
```
feature/[name]/
├── Controller.java
├── Service.java
├── Repository.java
├── Entity.java
└── Dto.java
```

## Logging
- SLF4J mit Logback
- INFO: Business-Events
- DEBUG: Technische Details
- Keine sensiblen Daten loggen

## Testing
- Unit Tests: JUnit 5 + Mockito
- Integration Tests: @SpringBootTest
- Testcontainers für DB-Tests
