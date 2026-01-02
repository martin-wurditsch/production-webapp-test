# Git-Workflow

## Branch-Strategie
- main: Produktions-Code (immer deploybar)
- develop: Integration-Branch
- feature/*: Feature-Entwicklung (z.B. feature/battery-management)
- bugfix/*: Bug-Fixes
- hotfix/*: Dringende Produktion-Fixes

## Commits
- Kleine, atomare Commits (eine logische Änderung pro Commit)
- Commit-Messages Format: [Typ] Kurzbeschreibung
  - Typen: [Feature], [Fix], [Refactor], [Docs], [Test]
  - Beispiel: "[Feature] Add battery configuration API endpoint"
- Englisch

## Nicht committen
- node_modules/, target/
- .env, application-local.yml
- IDE-spezifische Files (.idea/, .vscode/ außer shared configs)
- Build-Artefakte
