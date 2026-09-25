# Week 4 — Classes and objects

**Goal:** model a concept with state and behavior. Project: [University Course Manager](../../projects/04-university-course-manager/README.md).

```java
class Course {
    private final String code;
    private String title;
    private int credits;

    Course(String code, String title, int credits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
    }
    String getCode() { return code; }
    String getTitle() { return title; }
}
```

A class describes a kind of object; an object is an instance with its own state. A constructor runs during `new Course(...)`; it has the class name and no return type. `this` refers to the current object. `new` creates an object; variables of class types hold references. `final` fields must be assigned once.

Python comparison: a class also groups data and methods, but Java requires declared fields/types and constructors. `null` means no object; calling a method on it throws `NullPointerException`.

## Checks

- Two `new Course("CS1", ...)` calls create how many objects? → two, even if values match.
- Debug: `void Course(...)` intended as constructor. → remove `void`; otherwise it is an ordinary method.
- Debug: `Course c = null; c.getCode();` → initialize `c` before dereference or handle absence.

Keep object creation in a clear place and test behavior through public methods. **Explain back:** which invalid states does encapsulation prevent? Continue to [OOP](../week-05-oop/README.md).
