# Week 0 — Setup and how Java runs

**Goal:** run a Java 21 program and understand the toolchain. Check [Week 1](../week-01-fundamentals/README.md) next.

## JDK, compiler, JVM

The JDK contains developer tools including `javac`; the JVM executes Java bytecode. Typical flow:

```text
Main.java --javac--> Main.class (bytecode) --java/JVM--> output
```

An IDE automates compile/run, but the distinction explains stale output: editing `.java` without recompiling may run an older `.class`. Keep generated classes out of Git.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
    }
}
```

`main` is the entry point. A public top-level class normally lives in a same-named file (`Main` in `Main.java`). Java is statically typed and case-sensitive. Python comparison: Python commonly starts at the first statement in a script; Java applications enter through `main`.

## Checks

1. Predict: how many lines does two `println` calls produce? **Answer:** two.
2. Debug: `public class Main` saved as `App.java`. **Fix:** rename the file to `Main.java` or class to `App`.
3. Run with IDE or `javac Main.java` then `java Main`. Confirm output, then edit text and compile again.

**Gotchas:** `java Main` names a class; do not add `.class`. Modern Java also supports source-file mode `java Main.java`, but learn compile/run separately first. See [Week 10](../week-08-clean-code-testing/README.md) for keeping build output out of version control.
