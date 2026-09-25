# Week 6 — Exceptions, Date/Time, and Files

**Goal:** handle expected failures, represent dates safely, and persist small amounts of data. Project: [Food Expiry Tracker](../../projects/06-food-expiry-tracker/README.md).

## Exceptions and resources

Exceptions report failures. Use `throw` to signal a violated contract and `throws` to declare checked failures a caller must handle. Catch specific exceptions at a boundary where you can recover or give useful feedback; avoid swallowing failures. A custom exception can name a domain-specific failure.

```java
try {
    int count = Integer.parseInt(text);
} catch (NumberFormatException e) {
    System.out.println("Enter a whole number");
}
```

Use try-with-resources for `AutoCloseable` resources so files are closed even when an error occurs.

## Date/time

Use `LocalDate` for calendar dates, `LocalDateTime` for local date/time, and `Instant` for a point on the UTC timeline. Add a `ZoneId` when displaying a timeline moment for a user. Avoid storing dates as arbitrary strings.

```java
LocalDate expiry = LocalDate.now().plusDays(2);
long daysLeft = ChronoUnit.DAYS.between(LocalDate.now(), expiry);
```

## Files and CSV

`Path` and `Files` provide concise filesystem operations. Relative paths resolve from the process working directory, which may differ between VS Code and a terminal. Decide whether a write appends or replaces existing data. CSV requires quoting and escaping rules; splitting on commas is only suitable for a tightly constrained toy format.

```java
Path path = Path.of("data", "items.txt");
Files.createDirectories(path.getParent());
Files.writeString(path, "rice\nsoap\n");
String text = Files.readString(path);
```

## Predict, modify, debug, explain

- Predict: what does adding two days to the last day of a month produce? Use `LocalDate`, not manual day arithmetic.
- Modify: filter items expiring within seven days.
- Debug: `catch (Exception e)` before `catch (NumberFormatException e)` makes the specific catch unreachable; put the specific catch first.
- Explain: why must malformed input and failed file operations not be treated as successful results?

**Python comparison:** both languages have exceptions and date libraries. Java checked exceptions make some file failures explicit in method signatures; `Path` avoids hand-built platform-specific path strings.

**Backend connection:** uploads, exports, scheduled expiry checks, and database transactions all require clear failure handling and explicit date/time semantics.

Preserved earlier notes: [File I/O and JSON reference](file-io-and-json-reference.md). Continue to [Week 7](../week-07-collections-streams/README.md).
