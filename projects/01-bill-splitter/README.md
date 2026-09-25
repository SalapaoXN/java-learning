# Project 1 — Bill Splitter

## Purpose

Calculate a restaurant bill with service charge, VAT, discount, and an equal per-person share. The completed standalone implementation is in `src/BillSplitter.java`.

## Requirements

- Read subtotal, number of people, service charge percentage, VAT percentage, and discount percentage.
- Apply service charge to the subtotal, VAT after service charge, then discount to the pre-discount amount.
- Print each amount and the per-person share to two decimal places.

## Inputs, outputs, and validation

Input: five values from standard input. Output: a bill summary or `Invalid input`. Subtotal and people must be positive; percentages must be within 0–100. The current learning implementation uses `double`, suitable for this exercise but not production financial calculations.

## Concepts practiced

Scanner input, parsing, numeric types, arithmetic, validation with conditionals, formatted output, and calculation order.

## Suggested milestones

1. Trace the current calculation with small values by hand.
2. Run the existing program and compare actual output to the trace.
3. Add clear prompts or test an edge case only after explaining the current behavior.

## Edge cases

Zero/negative subtotal, zero people, percentages below zero or above 100, and malformed numeric input.

## Optional extensions

Support unequal shares or fixed-amount discounts. Later, refactor money calculations to `BigDecimal` and add tests.

## Review questions

- Why is VAT applied after service charge in this implementation?
- Why must people be greater than zero?
- What rounding limitations come from `double`?

Run from repository root:

```powershell
javac -d projects/01-bill-splitter/build projects/01-bill-splitter/src/BillSplitter.java
java -cp projects/01-bill-splitter/build BillSplitter
```
