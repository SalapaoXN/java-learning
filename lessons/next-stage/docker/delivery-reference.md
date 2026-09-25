# Backend 9 — Docker, CI/CD, observability, deployment

Docker packages an application and runtime; Compose can run app + local PostgreSQL for development. Keep secrets in environment/secret management, not image layers. CI builds and tests each change; deployment should have health checks, rollback strategy, and database migration plan.

Use structured logs with request IDs; metrics show rates, errors, and latency; traces connect work across boundaries. Avoid logging credentials or sensitive data. Monitoring should tell an operator what is failing and where.

**Check:** container works locally but cannot connect to DB—inside Compose use the service name as hostname, not `localhost`. Debug: app starts before database accepts connections—use health checks/retry with bounded backoff, not arbitrary long sleeps.

Next: [architecture and interview review]110-architecture-interview.md).
