# Java Learning

A beginner-friendly Java learning repository for moving from fundamentals to backend development. The lessons are reference material; build understanding by predicting, changing, debugging, and explaining small programs before expanding them.

## Roadmap

| Week | Focus | Lesson | Project |
|---|---|---|---|
| 0 | Setup, JDK/JVM, compile and run, Git basics | [Week 0](lessons/week-00-setup/README.md) | — |
| 1 | Variables, types, logic, input, decisions | [Week 1](lessons/week-01-fundamentals/README.md) | [Bill Splitter](projects/01-bill-splitter/README.md) |
| 2 | Loops and methods | [Week 2](lessons/week-02-loops-methods/README.md) | [Student Grade Calculator](projects/02-student-grade-calculator/README.md) |
| 3 | Arrays and collections | [Week 3](lessons/week-03-arrays-collections/README.md) | [CLI To-do List](projects/03-cli-todo-list/README.md) |
| 4 | Classes and objects | [Week 4](lessons/week-04-class-object/README.md) | [University Course Manager](projects/04-university-course-manager/README.md) |
| 5 | Object-oriented programming | [Week 5](lessons/week-05-oop/README.md) | [Cafe Ordering System](projects/05-cafe-ordering-system/README.md) |
| 6 | Exceptions, date/time, files, CSV | [Week 6](lessons/week-06-exceptions-date-files/README.md) | [Food Expiry Tracker](projects/06-food-expiry-tracker/README.md) |
| 7 | Collections, sorting, lambdas, streams | [Week 7](lessons/week-07-collections-streams/README.md) | [Expense Tracker](projects/07-expense-tracker/README.md) |
| 8 | Clean code, refactoring, testing | [Week 8](lessons/week-08-clean-code-testing/README.md) | Refactor Expense Tracker |
| 9 | SQL and JDBC | [Week 9](lessons/week-09-sql-jdbc/README.md) | [Roommate Expense Sharing](projects/08-roommate-expense-sharing/README.md) |
| 10 | Maven, HTTP, JSON, REST, Spring Boot intro | [Week 10](lessons/week-10-backend-foundation/README.md) | [First REST API](projects/09-first-rest-api/README.md) |

The [next-stage backend references](lessons/next-stage/README.md) cover Spring Boot, JPA/PostgreSQL, security, Docker, testing, Redis, and Kafka.

## Challenges

Small practice prompts are in [challenges](challenges/README.md). The existing Week 1 `Main.java` exercises are kept in [challenges/week-01](challenges/week-01/README.md).

## Learning workflow

**Read → Predict → Modify → Debug → Build → Explain**

For fundamentals and interview-style exercises, attempt the problem manually first. AI/Codex can help generate reference material, boilerplate, refactors, tests, or larger implementation pieces. Treat generated code as a draft: read it, run it, and make sure you can explain and modify it.

## Current progress

- Week 0 complete
- Week 1 complete
- Bill Splitter complete
- Next: Week 2 — Loops & Methods

## Running the existing Bill Splitter

From the repository root, compile and run the standalone source with the JDK:

```powershell
javac -d projects/01-bill-splitter/build projects/01-bill-splitter/src/BillSplitter.java
java -cp projects/01-bill-splitter/build BillSplitter
```

No Maven or Gradle build is required yet. See [project requirements](projects/01-bill-splitter/README.md).
