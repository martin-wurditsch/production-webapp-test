---
paths: frontend/**/*.{ts,tsx}
---

# Frontend (React 19)

## Stack
- React 19, TypeScript 5.x, Vite 7.x
- MUI v7, Tailwind CSS v4
- TanStack Query v5, React Router v7

## MUI + Tailwind v4 (wichtig!)
```tsx
// main.tsx - ohne das funktioniert die Kombination nicht
<StyledEngineProvider enableCssLayer>
  <GlobalStyles styles="@layer theme, base, mui, components, utilities;" />
  <ThemeProvider theme={theme}>{children}</ThemeProvider>
</StyledEngineProvider>
```

## React 19 Hooks
- `useActionState` - Form Submissions
- `useOptimistic` - Optimistische Updates  
- `use` - Promise/Context in Render

## API-Typen generieren
```bash
npx openapi-typescript http://localhost:8080/v3/api-docs -o src/types/api.ts
```

## Struktur
```
features/[name]/
├── components/
├── hooks/
├── services/
└── types/
```

## Forms & Validation
- React Hook Form für Form-Handling
- Zod für Schema-Validierung

## Error Handling
- Error Boundaries für Component-Fehler
- Toast/Snackbar (MUI) für User-Feedback
- Fehlermeldungen auf Deutsch
