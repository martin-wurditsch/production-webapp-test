---
paths: backend/**/Controller.java, frontend/**/services/*.ts
---

# API Contract

## Workflow
1. Backend: springdoc-openapi 2.x generiert Spec
2. Frontend: openapi-typescript generiert Types

## Endpoints
```
Swagger:     http://localhost:8080/swagger-ui.html
OpenAPI:     http://localhost:8080/v3/api-docs
```

## URL-Schema
```
/api/v1/[resource]
/api/v1/[resource]/{id}
```

## Response-Format
```json
{ "data": {...}, "timestamp": "..." }
{ "error": {"code": "...", "message": "..."}, "timestamp": "..." }
```
