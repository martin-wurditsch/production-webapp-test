# Architektur

## Monorepo
```
/
├── backend/     # Java/Spring Boot
├── frontend/    # React/Vite
└── docs/
```

## Backend Layer
```
Controller → Service → Repository → DB
```

## Frontend Layer
```
Component → Hook → Service → API
```

## Kommunikation
```
Frontend ←REST/JSON→ Backend ←→ MariaDB
```
