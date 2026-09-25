# Project 4 — University Course Manager

## Purpose

Represent courses and manage a small catalog using classes and encapsulated state.

## Requirements

Create courses with code, title, and credits; list, find, and update catalog entries. Keep course fields private and validate changes.

## Inputs and outputs

Input: course data and menu commands. Output: catalog details or clear not-found/validation feedback.

## Validation rules

Course code must be nonblank and unique; title must be nonblank; credits must be positive.

## Concepts practiced

Classes, objects, fields, methods, constructors, `this`, access modifiers, encapsulation, `static`, and `final`.

## Suggested milestones

1. Define a `Course` class.
2. Store courses in a collection.
3. Add search and update operations.

## Edge cases

Duplicate code, missing course, invalid credits, and empty catalog.

## Optional extensions

Model students and course enrollment.

## Review questions

Which invariants belong inside `Course`? What should remain the catalog's responsibility?
