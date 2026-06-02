# TEMPLATE_LIBRARY_NAME

> TEMPLATE_DESCRIPTION

This is the documentation site for your library. Replace this content with
your own. The mkdocs site is configured in `mkdocs.yml` at the repo root.

## Quick start

```kotlin
// Replace this snippet with your library's smallest meaningful API.
```

## Sections

- **Getting started** — install, first usage, key concepts
- **Features** — one page per top-level capability
- **Platform support** — Android, iOS, Desktop, Web matrices
- **Operations** — performance, security, parity audits
- **Release** — release process, postmortem template

## Adding pages

1. Drop the markdown file under `docs/<section>/<page>.md`
2. Register it in `mkdocs.yml` → `nav:`
3. Push to `development` — the `docs-publish.yml` workflow rebuilds and
   redeploys the site automatically (see `.github/workflows/docs-publish.yml`)

## Local preview

```bash
pip install -r docs/requirements.txt
mkdocs serve
# open http://127.0.0.1:8000
```
