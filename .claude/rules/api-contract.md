# API & Vertrag

- OpenAPI-Spezifikation für jedes Feature (Single Source of Truth)
- Backend generiert OpenAPI-Spec automatisch (springdoc-openapi)
- Frontend generiert TypeScript-Typen aus Spec (openapi-typescript)
- Keine manuellen API-Typen im Frontend
- API-First-Ansatz: Contract Design vor Implementation
- Versionierung über URL (/api/v1/...)
- RESTful Conventions (GET, POST, PUT, DELETE)
- Konsistente Response-Struktur (Success/Error)
