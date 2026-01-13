# Introduction to Programming Concepts 💻

Notes from the "Java Complete" course (Prof. Nélio Alves).

## 1. Algorithms & Automation
* **Algorithm:** A finite sequence of instructions to solve a problem (e.g., a recipe or laundry instructions).
* **Automation:** Using machines to execute these algorithms automatically.
* **Computer:** A machine designed to automate **computational algorithms** (data processing and calculations).

## 2. Tools for Development
To create software, we need:
* **Programming Language:** Definitions of lexical rules (spelling/keywords) and syntactic rules (grammar/structure).
* **IDE (Integrated Development Environment):** Software to edit, test, and debug code (e.g., Eclipse, IntelliJ, VS Code).
* **Compiler:** Transforms source code into object code.

## 3. Execution Models 🚀

### A. Compilation (e.g., C, C++)
* **Process:** Source Code -> Compiler -> Machine Code (Binary).
* **Pros:** Very fast execution; errors are caught before running.
* **Cons:** Needs to be recompiled for each Operating System (Windows, Linux, Mac).

### B. Interpretation (e.g., PHP, Python, JS)
* **Process:** Source Code -> Interpreter reads line by line -> Execution.
* **Pros:** Flexible; runs anywhere the interpreter is installed.
* **Cons:** Generally slower than compiled languages.

### C. Hybrid Approach (Java) ☕
Java uses the best of both worlds:
1.  **Compilation:** Source Code (`.java`) is compiled into **Bytecode** (`.class`).
2.  **Interpretation:** The **JVM (Java Virtual Machine)** reads the Bytecode and executes it on the device.
* **Benefit:** "Write once, run anywhere". As long as you have the JVM installed, the Bytecode runs on any OS.