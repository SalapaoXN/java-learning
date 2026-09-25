# Project 3 — CLI To-do List

## Purpose

Manage an ordered collection of tasks from a simple command-line menu.

## Requirements

Add, list, mark complete, and remove tasks. Assign stable task identifiers if list positions can change.

## Inputs and outputs

Input: menu choices and task details. Output: task list, completion state, and clear feedback for invalid choices.

## Validation rules

Reject blank task names and unknown identifiers; handle an empty list without errors.

## Concepts practiced

Arrays, `ArrayList`, generics, loops, menu methods, and simple object modeling.

## Suggested milestones

1. Store and list strings.
2. Add/remove tasks.
3. Add completion status and split menu actions into methods.

## Edge cases

Empty list, duplicate names, invalid selection, and removing the first/last task.

## Optional extensions

Priorities, due dates, and file persistence in Week 6.

## Review questions

When is a `List` more suitable than an array? Why can removing by index shift later elements?
