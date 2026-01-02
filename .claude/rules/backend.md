# Backend (Java, Spring Boot 3.x)

- Constructor Injection für Dependencies
- Jakarta Validation (@Valid) an API-Grenzen
- Controller: nur Routing/Mapping, keine Business-Logik
- Service: Business-Logik + @Transactional
- Global Exception Handling via @ControllerAdvice
- Services fokussiert halten (~300 Zeilen Richtwert)
- Logging mit SLF4J (INFO für Business, DEBUG für Technical)
- Testing:
  - Unit Tests (JUnit 5 + Mockito) für Services
  - Integration Tests (@SpringBootTest) für kritische Flows
- Feature-basierte Packages (z.B. /energy-monitoring, /battery-management)
