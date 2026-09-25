# Week 9 — SQL and JDBC

**Goal:** persist relational data safely. Project: [Roommate Expense Sharing](../../projects/08-roommate-expense-sharing/README.md).

A relational table has rows and columns; primary keys identify rows, foreign keys link them. Learn `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `WHERE`, joins, grouping, constraints, and transactions. Model entities around stable facts, not one giant text field.

JDBC basics: obtain a `Connection`, prepare a statement, bind parameters, execute, map a `ResultSet`, close resources. Use try-with-resources. Never concatenate user input into SQL.

```java
String sql = "SELECT id, amount FROM expense WHERE owner_id = ?";
try (PreparedStatement ps = connection.prepareStatement(sql)) {
    ps.setLong(1, ownerId);
    try (ResultSet rs = ps.executeQuery()) {
        while (rs.next()) System.out.println(rs.getBigDecimal("amount"));
    }
}
```

Use a transaction when multiple changes must succeed together; commit on success, rollback on failure. Python analogy: JDBC is a lower-level DB driver API; ORM frameworks later reduce repetitive mapping but do not remove SQL concepts.

## Checks

- Why `?` placeholders? → prevent input being interpreted as SQL and keep values typed.
- A transfer debits A then credits B; what if credit fails? → transaction rollback must undo debit.
- Debug: `"... WHERE name='" + name + "'"` → replace with a prepared statement.

**Explain back:** how does a foreign key protect relationships? Why is a transaction needed for multiple dependent updates? Continue to [backend foundation](../week-10-backend-foundation/README.md).
