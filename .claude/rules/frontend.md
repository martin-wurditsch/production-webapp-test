# Frontend (React 18 + TypeScript)

## Struktur
- Feature-basierte Struktur unter /features
- Functional Components + Hooks only
- Shared Components in /components/shared
- Feature-Module: je Feature eigene API-Calls, Components, Types

## UI & Styling
- MUI (Material-UI) v5+ für Components
- Tailwind CSS für Custom Layouts und Spacing
- Responsive Design (Mobile-First)
- MUI Theme für globale Styles (Farben, Typography)

## Data Fetching & State
- React Query v5 (TanStack Query) für Server State
  - Automatisches Caching, Loading, Error Handling
  - Query Keys: hierarchisch ['feature', 'entity', id]
- Context API für App State (Auth, Theme, User Settings)
- Lokaler State (useState) bevorzugen wo möglich

## API Integration
- API-Typen automatisch aus OpenAPI generiert (openapi-typescript)
- Axios als HTTP Client
- API-Calls in separaten Service-Dateien pro Feature

## Forms & Validation
- React Hook Form für Form-Handling
- Zod für Schema-Validierung
- Integration mit generierten API-Typen

## Typisierung
- Starke Typisierung, minimiere `any`
- Nutze `unknown` für externe/unsichere Daten
- Verwende generierte API-Types
- Explizite Return-Types optional bei offensichtlichen Funktionen

## Error Handling
- Error Boundaries für Component-Fehler
- React Query handled API-Errors automatisch
- Toast/Snackbar (MUI) für User-Feedback
- Klare Error-Messages auf Deutsch

## Performance (Edge-Optimierung)
- Code Splitting: React.lazy() für Routes
- MUI Tree-Shaking konfigurieren
- Lazy Loading für große Components
- React Query: staleTime & cacheTime sinnvoll setzen

## Accessibility
- Semantisches HTML (button, nav, main, section)
- MUI bringt A11y-Support mit
- Alt-Texte für Bilder
- Keyboard-Navigation testen

## Routing
- React Router v6
- Lazy Loading für Route Components
- Protected Routes mit Context API

## Testing
- Vitest + React Testing Library
- Component Tests für kritische UI-Logik
- Mock-Service-Worker (MSW) für API-Mocks
- Integration Tests für komplette User-Flows

## Build & Tooling
- Vite als Build Tool
- ESLint + Prettier für Code-Qualität
- TypeScript strict mode
