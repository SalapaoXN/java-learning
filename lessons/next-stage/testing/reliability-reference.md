# Backend 6 — Transactions, concurrency, idempotency

A database transaction groups related writes: all commit or all roll back. Concurrent requests can race: two requests each read balance 100 and spend 80. Prevent overspending with a conditional update, optimistic version column, or appropriate row lock; choose and test an isolation strategy.

Idempotency makes retries safe. Client sends an idempotency key; server stores key + request identity + final result under a uniqueness constraint. A repeated matching request returns the original result; same key with different payload is rejected. Define retention and behavior for in-progress requests.

**Check:** two simultaneous transfers of 80 from 100 must not both succeed. Debug: checking balance in Java then writing later without locking/constraint has a race window.

Next: [backend testing]007-testing.md).
