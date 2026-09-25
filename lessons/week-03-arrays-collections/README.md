# Week 3 — Arrays and collections

**Goal:** keep groups of values and select a structure by access pattern. Project: [CLI To-do List](../../projects/03-cli-todo-list/README.md).

## Arrays

```java
int[] scores = {80, 90, 75};
System.out.println(scores[0]); // 80
```

Arrays have fixed length and zero-based indices. Two-dimensional arrays are arrays of arrays; rows can have different lengths in Java. Always ensure an index is between `0` and `length - 1`.

## Collections

```java
List<String> tasks = new ArrayList<>();
tasks.add("Read");
tasks.remove("Read");
Set<String> tags = new HashSet<>();
Map<String, Integer> counts = new HashMap<>();
counts.put("java", 2);
```

`ArrayList` is resizable and ordered; `HashSet` stores unique values with no guaranteed iteration order; `HashMap` maps keys to values. Use generics (`List<String>`) for compile-time element type checks. Primitive types use wrappers in collections (`Integer`, not `int`).

Python comparison: list≈`ArrayList`, set≈`HashSet`, dict≈`HashMap`; Java declares generic element/key/value types.

## Checks

- Add `"A"` twice to a set: size? → `1`.
- `List.of("x","y").get(1)` → `y`.
- Debug: `List<int>` → use `List<Integer>`.
- Debug: removing elements from a list in an increasing index loop may skip items; use iterator/removeIf or iterate backward.

Choose list for sequence, set for membership/uniqueness, map for lookup by key. **Explain back:** why are generics useful? Where would each structure appear in a backend? Continue to [classes and objects](../week-04-class-object/README.md).
