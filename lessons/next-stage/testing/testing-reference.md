# Backend 7 — Backend testing

Use unit tests for domain/service rules, MVC tests for HTTP mapping/security, and integration tests for real database behavior. Testcontainers can run disposable PostgreSQL for integration checks. Mockito is useful for a narrow external boundary; excessive mocks can make tests verify implementation details rather than behavior.

Test success, validation, permission denial, rollback, duplicate idempotency key, and concurrent boundary behavior. Keep test data isolated and avoid dependence on machine timezone or test order. CI should run the same build/test lifecycle developers use.

**Check:** service unit test passes but SQL migration fails—what layer is missing? → integration test against a database. Debug: tests share mutable static data; isolate fixture setup and cleanup.

Next: [Redis and Kafka]008-redis-kafka.md).
