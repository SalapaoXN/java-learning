# Project 5 — Cafe Ordering System

## Purpose

Model a cafe order using composition and polymorphic item or payment behavior.

## Requirements

Create menu items, add them to an order, calculate a total, and print a receipt. Use an enum for order status and small interfaces where behavior varies.

## Inputs and outputs

Input: menu selections and quantities. Output: itemized order, total, and status.

## Validation rules

Quantities must be positive; unknown menu items are rejected; an empty order cannot be finalized.

## Concepts practiced

Inheritance, polymorphism, abstract classes, interfaces, composition, overriding, `super`, and enums.

## Suggested milestones

1. Define menu item and order classes.
2. Add multiple item types with a shared contract.
3. Add status transitions and receipt formatting.

## Edge cases

Empty order, invalid quantity, repeated item, and invalid status transition.

## Optional extensions

Discount rules or multiple payment strategies.

## Review questions

Where does composition make the model clearer than inheritance? Which behavior is polymorphic?
