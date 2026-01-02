# Energie-Management-System

## Projekt-Kontext
Energie-Management-System UI für Edge (Industrie-PC) und Cloud.
Team: 4-5 Java-Entwickler mit begrenztem React/TypeScript-Wissen.

## Entwicklungs-Prinzipien
- Produktiv-Code, keine Prototypen
- Kleine, reviewbare Schritte (max. 300 Zeilen/Datei)
- Review-Prozess: mindestens 1 Person
- Code muss für Java-Devs verständlich sein
- Feature-Complete: Backend + Frontend + Tests

## Tech Stack
- **Backend**: Java 25, Spring Boot 3.x, MariaDB
- **Frontend**: React 19, TypeScript, MUI, Tailwind, React Query
- **Tools**: Claude Code, Git, Docker, Portainer

## Deployment
- **Edge (Standard)**: 3 Docker Container (MariaDB, Backend, Frontend) auf Industrie-PC
- **Development**: Lokal ohne Docker, zentrale MariaDB im Netz
- **Cloud**: Zukünftige Option

## Code-Generierungs-Format
1. Übersicht: Was wird erstellt
2. Ordnerstruktur: Neue/geänderte Dateien markieren
3. Code: Vollständig pro Datei, keine Platzhalter
4. Design-Entscheidungen: Kurze Begründung
5. Testing-Hinweise: Welche Tests, Edge-Cases

**Stil**: Kein unnötiger Text, deutsche Kommentare, englische Commits

## Detaillierte Guidelines
Siehe `.claude/rules/` für spezifische Richtlinien.
