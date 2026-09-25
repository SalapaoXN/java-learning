# Week 8 — Collections and Stream API

**Goal:** transform and summarize collections clearly. Project: [Expense Tracker](../../projects/07-expense-tracker/README.md).

```java
List<Integer> values = List.of(2, 5, 8);
int total = values.stream()
    .filter(n -> n % 2 == 0)
    .mapToInt(Integer::intValue)
    .sum(); // 10
```

A stream is a pipeline over data: source → intermediate operations (`filter`, `map`, `sorted`) → terminal operation (`sum`, `toList`, `forEach`). Intermediate operations are lazy; nothing runs until a terminal operation. Prefer a normal loop when it is clearer or needs complex control flow. Avoid side effects inside stream lambdas.

`Optional<T>` represents a value that may be absent; use it as an API signal, not as a replacement for every nullable field. `BigDecimal` is immutable; use `compareTo` for numeric equality and construct from decimal strings for money (`new BigDecimal("0.10")`).

## Checks

- Filter evens from `[2,5,8]`, double, sum → `20`.
- Debug: `new BigDecimal(0.1)` carries binary floating approximation; use `new BigDecimal("0.1")`.
- Debug: a stream variable cannot generally be reused after a terminal operation; create a new stream from the source.

**Explain back:** why are intermediate operations lazy? When is a loop easier to understand? Where can streams help transform query results? Continue to [clean code and testing](../week-08-clean-code-testing/README.md).
