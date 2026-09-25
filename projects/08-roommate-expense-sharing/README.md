# Project 8 — Roommate Expense Sharing

## Purpose

Record shared household expenses and show who paid and how costs are split.

## Requirements

Manage roommates and expenses, query a relational database through JDBC, and produce per-person totals. Use transactions when a single action changes multiple records.

## Inputs and outputs

Input: payer, amount, description, date, and participants. Output: expense history and balances.

## Validation rules

Require known participants and positive amounts; use prepared statements for all user-provided values.

## Concepts practiced

SQL tables, primary/foreign keys, CRUD, joins, grouping, JDBC `Connection`, `PreparedStatement`, `ResultSet`, and transactions.

## Suggested milestones

1. Design tables and write SQL queries.
2. Add JDBC create/list operations.
3. Add split calculations and transactional updates.

## Edge cases

Unknown roommate, no participants, fractional remainder, duplicate submissions, and partial database failure.

## Optional extensions

Settlement suggestions, PostgreSQL, or an API in Week 10.

## Review questions

Why use prepared statements? When must related updates share a transaction?
