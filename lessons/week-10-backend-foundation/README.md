# Week 10 — Backend Foundation

**Goal:** understand how a small Java program becomes an HTTP service. Project: [First REST API](../../projects/09-first-rest-api/README.md).

## Concepts

Maven describes the build and dependencies in `pom.xml`. HTTP requests carry a method, path, headers, and sometimes a body; responses include a status code and often JSON. REST uses resource-oriented endpoints and HTTP semantics: GET reads, POST creates, PUT replaces, and DELETE removes. Spring Boot provides application wiring and sensible defaults.

```java
@RestController
@RequestMapping("/api/expenses")
class ExpenseController {
    @GetMapping
    List<String> list() { return List.of("food"); }
}
```

## Java and Python comparison

Both ecosystems separate web routing, business behavior, and persistence. Spring uses explicit types and annotations; follow a request into the service and data layer to understand the generated project.

## Predict, modify, debug, explain

- Predict which status is more suitable when a resource is newly created: `200` or `201`?
- Modify a resource path to address one expense by ID.
- Debug a controller that returns a raw exception message as a successful response.
- Explain why controller, service, and repository responsibilities are separated.

**Backend connection:** these are the core boundaries of a maintainable API. The [next-stage lessons](../next-stage/README.md) deepen Spring, persistence, security, testing, and operations.
