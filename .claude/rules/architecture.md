# Architektur

## Monorepo-Struktur
- `/backend` und `/frontend`
- Layered Architecture mit Feature-basierter Struktur

## Pro Feature
**Backend**: Controller → Service → Repository + Domain Models + DTOs
**Frontend**: Components, Services, Types, Hooks

## Shared Code
- `/shared` (Backend): Security, Utils, gemeinsame Entities
- `/components/shared` (Frontend): Wiederverwendbare Components
