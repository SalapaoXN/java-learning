# Backend 5 — Wallet, transfer, and ledger

Model a transfer as one use case, not “change two balances and hope”. Check positive amount, ownership, sufficient funds, distinct source/target, currency, and account status. Use `BigDecimal` with explicit scale/rounding policy.

A ledger records immutable debit/credit entries; for each transfer, total debits equal total credits. A displayed balance can be derived from entries or maintained as a carefully reconciled projection. Record transaction IDs and timestamps; never silently edit historical money movements.

**Check:** transfer 50 from A to B creates debit 50 and credit 50; system-wide entries net to zero. Debug: updating A and failing before B leaves money missing—wrap all writes in one database transaction.

Next: [reliability]006-reliability.md).
