# Week 7 — File I/O and JSON

**Goal:** preserve data after the program exits. Project: Dorm Inventory.

Use `Path` and `Files` for straightforward filesystem work:

```java
Path path = Path.of("data", "items.txt");
Files.createDirectories(path.getParent());
Files.writeString(path, "rice\nsoap\n");
String text = Files.readString(path);
```

These operations can throw `IOException`; handle/report it at a boundary. Relative paths resolve from the process working directory, which may differ between IDE and terminal. Don’t overwrite a user file without deciding whether to append, replace, or back it up.

JSON represents structured data, but don’t parse it by splitting commas: strings can contain commas, escapes, and nested objects. Use a library such as Jackson once the project has a build tool; map JSON to DTOs or records and validate after parsing.

```java
record InventoryItem(String name, int quantity) {}
```

Python comparison: JSON is a format, not a Java object; Python has built-in `json`, while Java projects commonly add a library dependency.

## Checks

- What happens if `data/` is missing before write? → create parent directories or handle failure.
- Debug: absolute path is built by concatenating strings with `\\`; use `Path.of(...)` for OS-aware paths.
- Explain why malformed or untrusted JSON must be validated before use.

Continue to [collections and streams](../week-07-collections-streams/README.md).
