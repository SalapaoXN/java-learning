# Backend 4 — Authentication and authorization

Authentication answers “who are you?”; authorization answers “may you do this?”. Store passwords only as adaptive one-way hashes using a maintained framework encoder; never encrypt or log raw passwords. Use Spring Security filter chain and least privilege.

JWT is a signed token carrying claims and expiry; a valid signature does not mean every claim is trustworthy for authorization without checking issuer, audience, expiry, and permissions. Protect keys/secrets outside source control, use TLS, and plan rotation. For a first project, prefer framework-supported flows and understand session vs token trade-offs before hand-rolling JWT.

**Check:** user A asks for user B’s expense ID; ownership check must deny access even if the ID is valid. Debug: hiding a button in UI is not server authorization.

Next: [wallet and ledger]005-wallet-ledger.md).
