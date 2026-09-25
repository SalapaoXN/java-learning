# Project 6 — Food Expiry Tracker

## Purpose

Track food items and identify what is expired or approaching its expiry date.

## Requirements

Add, list, find, and remove items; calculate expiry status with `LocalDate`; optionally save and load CSV data.

## Inputs and outputs

Input: item name, quantity, and expiry date. Output: inventory and status grouped by urgency.

## Validation rules

Names must not be blank, quantity must be positive, and dates must parse as valid dates.

## Concepts practiced

Exceptions, custom errors, `LocalDate`, file read/write, try-with-resources, and CSV basics.

## Suggested milestones

1. Track items in memory.
2. Add expiry filtering.
3. Persist and reload records.

## Edge cases

Expired today, invalid date, missing/empty file, and CSV fields containing commas.

## Optional extensions

Use a CSV library later, add categories, or notify for items expiring soon.

## Review questions

Why use `LocalDate` instead of a date string? Where should file exceptions be handled?
