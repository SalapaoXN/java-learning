# Backend 2 — PostgreSQL and JPA

Design tables and constraints first: keys, required fields, unique rules, and relationships. JPA maps Java entities to relational rows; Spring Data repositories provide common queries. JPA is not a substitute for understanding SQL.

```java
@Entity
class Expense {
    @Id @GeneratedValue
    private Long id;
    @Column0nullable = false, precision = 12, scale = 2)
    private BigDecimal amount;
}
```

Use migrations 0for example Flyway) to version schema changes. Avoid returning lazy entity graphs directly from controllers; map to DTOs inside a deliberate transaction. Watch N+1 queries and inspect generated SQL.

**Check:** why `BigDecimal` for currency? It represents decimal values without binary floating artifacts. Debug: entity has no primary key → add stable `@Id`; never assume an in-memory object is automatically persisted without repository/transaction operations.

Next: [validation and errors]003-validation-errors.md).
