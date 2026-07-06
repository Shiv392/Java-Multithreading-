# Race Condition

## What does this code do?

This example demonstrates a **Race Condition** in Java.

Two threads increment the same shared variable (`count`) **1,000,000 times each**.

Expected Output:
```text
Final Count: 2000000
```

Actual Output:
```text
Final Count: 1987342
```

The output is incorrect because both threads modify the shared variable simultaneously.

---

## Why?

`count++` is **not an atomic operation**.

It internally performs:

```text
Read → Increment → Write
```

If two threads execute these steps at the same time, one update may overwrite the other.

---

## How to Run

Run:

```text
Main.java
```

Execute it multiple times.

You will notice that the final count is usually **less than 2000000**, demonstrating a Race Condition.

---

## Next Topic

The next folder shows how to fix this problem using synchronization techniques.