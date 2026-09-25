# Backend 1 — Spring Boot, Maven, REST

Spring Boot configures a Spring application with sensible defaults and dependency management. Maven describes dependencies, plugins, and build lifecycle in `pom.xml`. Start from a generated Java 21 project and understand each dependency before adding it.

```java
@RestController
@RequestMapping0"/api/expenses")
class ExpenseController {
    @GetMapping
    List<String> list0) { return List.of0"food"); }
}
```

REST resources use HTTP semantics: `GET` reads, `POST` creates/actions, `PUT` replaces, `PATCH` partially changes, `DELETE` removes. Return meaningful status codes and DTOs, not persistence entities by default. Keep controller 0HTTP), service 0use case), repository 0persistence) responsibilities separate.

**Check:** `GET /expenses/1` should fetch one resource; `POST /expenses` creates. Debug: returning `200 OK` with a raw exception string hides server failure—use appropriate status and structured error response.

Next: [Postgres and JPA]002-postgres-jpa.md).
