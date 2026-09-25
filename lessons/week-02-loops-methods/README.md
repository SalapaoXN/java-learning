# Week 2 — Loops and methods

**Goal:** repeat work safely and give each task a named method. Project: [Student Grade Calculator](../../projects/02-student-grade-calculator/README.md).

## Loops

```java
for (int i = 1; i <= 3; i++) System.out.println(i);
int remaining = 3;
while (remaining > 0) remaining--;
do { remaining++; } while (remaining < 3);
```

Use `for` when iteration/count is clear; `while` for “until condition”; `do-while` when the body must run once (menu prompt). `break` exits a loop; `continue` skips to its next iteration. Nested loops multiply work: 3×4 iterations means 12 inner executions.

Python comparison: `for x in range(...)` resembles Java’s enhanced for; Java’s counted `for` explicitly has initialization, condition, update.

## Methods and scope

```java
static double average(int total, int count) {
    if (count == 0) throw new IllegalArgumentException("count must be positive");
    return (double) total / count;
}
```

A parameter is input; `return` sends a result to the caller. `void` means no returned value. `static` methods belong to the class and can be called from `main`. A variable declared inside a block is local to that block. Overloading means same method name with different parameter lists; return type alone cannot distinguish overloads.

## Predict / debug

- `for (int i=0; i<3; i++) print(i)` prints `012`.
- What is `average(5, 2)`? → `2.5`, because conversion happens before division.
- Debug: `for (int i=0; i<=items.length; i++)` → last index is `length - 1`; use `<`.
- Debug: `while (n > 0) { print(n); }` never changes `n`; decrement or the loop does not finish.

Build the Student Grade Calculator in small milestones. Explain which data each method receives and returns. Continue to [collections](../week-03-arrays-collections/README.md).
