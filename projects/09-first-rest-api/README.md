# Project 9 — First REST API

## Purpose

Convert one small existing project use case into a REST API as an introduction to backend structure.

## Requirements

Choose a project such as Expense Tracker; define JSON DTOs and REST endpoints, then separate controller, service, and persistence responsibilities. Use Maven and Spring Boot when Week 10 begins.

## Inputs and outputs

Input: HTTP requests with path/query parameters or JSON. Output: JSON responses and meaningful HTTP status codes.

## Validation rules

Validate request data and return consistent errors. Do not expose persistence entities by default.

## Concepts practiced

Maven, dependencies, HTTP, JSON, REST, GET/POST/PUT/DELETE, status codes, and Spring Boot introduction.

## Suggested milestones

1. Define resource and endpoint contracts.
2. Implement an in-memory vertical slice.
3. Add validation and tests before database persistence.

## Edge cases

Missing resource, malformed JSON, invalid values, duplicate create, and unsupported method.

## Optional extensions

PostgreSQL/JPA, authentication, Docker, and integration tests in the next stage.

## Review questions

Which operation is safe/idempotent? What belongs in controller versus service?
