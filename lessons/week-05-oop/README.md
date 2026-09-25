# Week 5 — Encapsulation, inheritance, interfaces

**Goal:** make invalid states harder to create and use polymorphism where it helps. Project: [Cafe Ordering System](../../projects/05-cafe-ordering-system/README.md).

Encapsulation hides mutable state and exposes meaningful operations:

```java
class Bank { // illustrative only
    private int balance;
    void deposit(int amount) {
        if (amount <= 0) throw new IllegalArgumentException();
        balance += amount;
    }
    int balance() { return balance; }
}
```

Inheritance (`extends`) models a true “is-a” relationship and reuses/overrides behavior. Prefer composition when one object merely uses another. An interface defines a capability/contract; classes can implement multiple interfaces. Code against the interface (`List`, not `ArrayList`) when callers need only the contract. `@Override` lets the compiler catch signature mistakes.

```java
interface Payable { int totalCents(); }
class Order implements Payable { public int totalCents() { return 1200; } }
```

Python comparison: duck typing is more flexible; Java interfaces make the contract explicit at compile time.

## Checks

- If `Order` implements `Payable`, a `Payable p = new Order()` call to `p.totalCents()` dispatches to `Order` → `1200`.
- Debug: public mutable `balance` can be set negative by any caller; make it private and validate through operations.
- Avoid deep inheritance trees; use an interface + composed collaborators when behavior varies independently.

**Explain back:** when does composition fit better than inheritance? Where can an interface make backend dependencies easier to replace in tests? Continue to [exceptions, dates, and files](../week-06-exceptions-date-files/README.md).
