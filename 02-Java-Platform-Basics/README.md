# Java Platform & First Program ☕

Notes from the introduction module. Understanding how Java works under the hood.

## 1. Why Java?
* [cite_start]**Portability:** Solved the problem of having to rewrite code for different Operating Systems[cite: 260].
* [cite_start]**Memory Management:** Introduced automatic memory management (no pointers)[cite: 259].
* [cite_start]**Huge Ecosystem:** 3 Billion devices run Java[cite: 273].

## 2. Java Editions
* **Java SE (Standard Edition):** The core platform for desktop and servers. [cite_start]This is what we are studying[cite: 279].
* [cite_start]**Java EE (Enterprise Edition):** For large-scale corporate applications[cite: 280].
* [cite_start]**Java ME (Micro Edition):** For embedded devices and IoT[cite: 278].

## 3. How Java Works (The JVM) ⚙️
Java is a **Hybrid Language** (Compiled + Interpreted).

1.  **Source Code (`.java`):** You write the code.
2.  **Compiler:** Translates source code into **Bytecode** (`.class`). [cite_start]Bytecode is platform-agnostic[cite: 372, 373].
3.  [cite_start]**JVM (Java Virtual Machine):** Translates Bytecode into Machine Code for the specific hardware (Windows, Mac, or Linux)[cite: 377, 379].

> "Write once, run anywhere."

## 4. Application Structure
A logical hierarchy organizes Java projects:
* [cite_start]**Application** (The whole system)[cite: 456].
* [cite_start]**Modules** (Logical grouping of packages, Java 9+)[cite: 419].
* [cite_start]**Packages** (Logical grouping of related classes, e.g., `Entities`, `Services`)[cite: 402].
* [cite_start]**Classes** (The basic building blocks)[cite: 385].