# Java Multithreading 🚀

A hands-on Java Multithreading repository where I learn concepts by implementing them with code instead of only reading theory.

The goal of this repository is to build a strong understanding of Java concurrency before moving into Low Level Design (LLD) and backend system design.

---

## 📚 Learning Roadmap

Follow the topics in the given order.

                 Java Concurrency

                      │
        ┌─────────────┼─────────────┐
        │             │             │
        ▼             ▼             ▼
     Thread     ExecutorService   CompletableFuture

 Executes       Manages Threads   Manages Async Flow

 Actual Work    Thread Pool        Result + Chaining

### 1️⃣ Threads
Learn the basics of Java Threads.

Topics Covered:
- Process vs Thread
- Creating Threads
- Thread Lifecycle
- start()
- run()
- sleep()
- join()
- yield()
- Virtual Threads (Java 21)

---

### 2️⃣ Race Condition
Understand what happens when multiple threads access shared data simultaneously.

Topics Covered:
- Shared Resource
- Race Condition
- Lost Updates
- Why `count++` is not atomic
- Practical examples

---

### 3️⃣ Synchronization & Locks
Learn how Java prevents race conditions.

Topics Covered:
- synchronized keyword
- Monitor Lock (Intrinsic Lock)
- Critical Section
- ReentrantLock
- lock()
- unlock()
- tryLock()

---

### 4️⃣ Executor Framework
Learn how production applications manage threads.

Topics Covered:
- Thread Pool
- ExecutorService
- Fixed Thread Pool
- Cached Thread Pool
- Single Thread Executor
- submit()
- execute()
- shutdown()

---

## 📂 Project Structure

```
JAVA-MULTITHREADING
│
├── Threads/
├── RaceCondition/
├── SynchronizedLock/
├── ReentrantLock/
├── ExecutorService/
└── README.md
```

---

## 🎯 Purpose

This repository is created to:

- Learn Java Multithreading from scratch
- Understand concepts through code
- Build interview-ready knowledge
- Prepare for Low Level Design (LLD)
- Create reusable notes for future revision

---

## 💡 Learning Approach

For every topic I follow the same process:

1. Learn the theory
2. Write code from scratch
3. Experiment with examples
4. Understand edge cases
5. Document key learnings

---

## 🛠 Tech Stack

- Java
- IntelliJ IDEA / VS Code
- JDK 21

---

## 📌 Status

- ✅ Threads
- ✅ Race Condition
- ✅ Synchronization
- ✅ Reentrant Lock
- ⏳ Executor Framework
- ⏳ Advanced Concurrency Utilities
- ⏳ Low Level Design

---

## ⭐ Note

This repository is part of my Software Engineer interview preparation journey, where the focus is on understanding concepts deeply rather than memorizing them.