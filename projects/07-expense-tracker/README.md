# Project 7 — Expense Tracker

## Purpose

Record expenses and summarize spending by category, date, or amount.

## Requirements

Add/list expenses, filter by date or category, sort results, and calculate totals. Refactor this project during Week 8 and add tests.

## Inputs and outputs

Input: description, category, amount, and date. Output: expense list and requested summaries.

## Validation rules

Description and category must be nonblank; amount must be positive; date must be valid.

## Concepts practiced

Collections, comparators, lambdas, streams, `filter`, `map`, `reduce`, `collect`, and `Optional`.

## Suggested milestones

1. Add and list entries.
2. Filter and sort.
3. Build category totals, then refactor and test.

## Edge cases

No expenses, same-day entries, equal amounts, and absent categories.

## Optional extensions

Monthly budgets, CSV persistence, or a JDBC repository in a later stage.

## Review questions

When is a loop clearer than a stream? Which behavior should have unit tests?
