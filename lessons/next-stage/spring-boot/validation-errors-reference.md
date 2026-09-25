# Backend 3 — Validation and error handling

Validate at boundaries and enforce core invariants in the domain/service too. Bean Validation annotations 0`@NotNull`, `@Positive`, `@Size`) communicate input constraints; business rules such as “wallet cannot go below zero” belong in use-case logic and database protections where applicable.

Return a stable error shape with code, message, and field details. Use `@ControllerAdvice` to translate known exceptions into HTTP responses. Do not leak stack traces, SQL, or secret values to clients; keep diagnostic detail in server logs with a request/correlation ID.

**Check:** malformed JSON → `400`; unauthenticated request → `401`; authenticated but forbidden → `403`; missing resource → `404`; unexpected bug → `500`. Debug: validation annotation exists but never runs—ensure request DTO has `@Valid` at the controller boundary.

Next: [security]004-security.md).
