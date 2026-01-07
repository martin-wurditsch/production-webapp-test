# Energie-Management-System

Energie-Management für Edge (Industrie-PC) und Cloud.
Team: Java-Entwickler mit begrenztem React/TypeScript-Wissen.

## Commands

```bash
# Backend
cd backend && mvn clean install    # Build
cd backend && mvn test             # Tests
cd backend && mvn spring-boot:run  # Server

# Frontend  
cd frontend && npm install         # Dependencies
cd frontend && npm run dev         # Dev Server
cd frontend && npm run build       # Build
cd frontend && npm run typecheck   # TypeScript
cd frontend && npm run test        # Tests
```

## Workflow
- Typecheck und Tests nach Code-Änderungen
- Kleine, atomare Commits
- Features komplett: Backend + Frontend + Tests

## Entwicklungs-Prinzipien
- Produktiv-Code, keine Prototypen
- Kleine, reviewbare Schritte (max 300 Zeilen/Datei)
- Code muss für Java-Devs verständlich sein
- Review-Prozess: mindestens 1 Person

## Code-Generierung
1. Übersicht: Was wird erstellt
2. Ordnerstruktur: Neue/geänderte Dateien markieren
3. Code: Vollständig pro Datei, keine Platzhalter
4. Design-Entscheidungen: Kurze Begründung
5. Testing-Hinweise: Welche Tests, Edge-Cases

## Stil
- Deutsche Kommentare, englische Commits
- Kein unnötiger Text

## Dependencies
- Neue Dependencies: Aktuelle stabile Version via Web-Suche ermitteln
- Bestehende Dependencies: Nur bei ausdrücklicher Anfrage updaten
- Immer prüfen: Kompatibilität, Breaking Changes, Security

## Stack
- Backend: Java 25, Spring Boot 4.x, MariaDB
- Frontend: React 19, TypeScript 5.x, MUI v7, Tailwind v4, Vite 7.x

## Projekt-Kontext
- @README.md
- @backend/pom.xml
- @frontend/package.json
