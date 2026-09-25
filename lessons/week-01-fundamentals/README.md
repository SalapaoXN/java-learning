# Week 1 — Fundamentals and Bill Splitter

**Goal:** values, input, expressions, and decisions. Then review the completed [Bill Splitter](../../projects/01-bill-splitter/README.md).

## Types and expressions

```java
int count = 4;
long population = 8_000_000_000L;
double rate = 7.5;
boolean valid = count > 0;
char grade = 'A';
String name = "Mina";
```

Choose a type by meaning: an ID with leading zeros is text, not a quantity. `char` is one UTF-16 code unit; `String` is text. Unlike Python, Java declares types and many type conversions must be explicit.

Arithmetic: `+ - * / %`; comparisons: `== != < <= > >=`; boolean operators: `&& || !`. Integer division truncates: `10 / 3 == 3`. Use `10.0 / 3` for a fractional result. Parentheses matter when `+` also concatenates text.

## Input and decisions

```java
Scanner in = new Scanner(System.in);
int age = Integer.parseInt(in.nextLine());
if (age >= 18) System.out.println("Adult");
else System.out.println("Minor");
```

Using `nextLine()` then parsing consistently avoids the leftover newline trap after `nextInt()`. `if/else if` checks top to bottom; put narrower/high thresholds first. `switch` is useful for exact choices. For strings, compare values with `.equals()`, not `==` (which compares object identity).

## Bill Splitter flow

Food subtotal → service charge → VAT on after-service amount → discount on pre-discount total → divide by people. Validate food and people `> 0`; percentages `0..100`. Format with `printf("%.2f%n", amount)`. `double` can have binary rounding; switch to `BigDecimal` for real financial rules later.

## Predict / debug

- `System.out.println(5 + 2 + "x")` → `7x`; `"x" + 5 + 2` → `x52`.
- `int n = 7; System.out.println(n / 2);` → `3`.
- `String a = new String("ok"), b = new String("ok");` What are `a == b` and `a.equals(b)`? → `false`, `true`.
- Debug: grade checks `score >= 50` before `score >= 80`. A score of 90 gets the first branch; reorder from highest threshold down.

**Explain back:** why use `.equals()` for strings? What does integer division do? Where might input validation appear in a backend request?

Continue: [loops and methods](../week-02-loops-methods/README.md).
