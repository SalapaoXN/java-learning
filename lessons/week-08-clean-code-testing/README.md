# Week 8 — Clean Code and Testing

**Goal:** make changes understandable and behavior repeatable. Refactor and test the [Expense Tracker](../../projects/07-expense-tracker/README.md).

Use clear names and keep each method focused on one responsibility. Put related types into packages as the project grows. Use the debugger to inspect state at the point behavior diverges from expectations. `.gitignore` should exclude generated output such as `*.class` and IDE caches.

JUnit tests verify behavior; test names describe conditions and outcomes. Arrange inputs, act, assert results. Test normal, boundary, invalid, and failure cases. Keep tests deterministic and independent. Mockito can replace collaborators in unit tests, but don’t mock every object; integration tests should exercise real wiring/database boundaries where practical.

```java
@Test
void rejectsZeroPeople() {
    assertThrows(IllegalArgumentException.class,
        () -> bill.split(1000, 0));
}
```

Python comparison: JUnit is similar to pytest; both support assertions and fixtures, while Java types are also checked at compile time.

## Checks

- Why test `people=0`? → division would be invalid.
- What does `assertThrows` verify? → that the operation fails with the expected exception contract.
- Debug: test passes only after sleeping 1 second → replace timing dependency with a controllable clock or synchronization.

**Explain back:** what makes a unit test independent? Which edge cases deserve tests? Continue to [SQL and JDBC](../week-09-sql-jdbc/README.md).
