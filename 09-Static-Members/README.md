# ⚡ Static Members and Utility Classes - Java

Exploring the `static` keyword and understanding the difference between class-level members and instance-level members.
*Based on Dr. Nelio Alves' Java Course.*

## 🧠 Key Concepts Applied
* **Static Keyword:** Defining attributes and methods that belong to the class itself, rather than to any specific object instance.
* **Utility Classes:** Creating classes meant strictly for processing data or holding constants (similar to `java.lang.Math`), eliminating the need for instantiation.
* **Constants (`final`):** Declaring immutable class-level values, such as tax rates or mathematical constants.
* **Memory Efficiency:** Understanding that static members are loaded once into memory, making them ideal for universal operations.

## 📋 Scenarios Implemented

### 1. Currency Converter (Utility Class)
A practical financial calculator that converts US Dollars to Brazilian Reais (BRL).
* **Business Logic:** Applies a flat exchange rate and automatically adds a 6% IOF (Financial Operations Tax) to the final amount.
* **Implementation Details:** The `CurrencyConverter` class uses exclusively static methods and constants, allowing the main program to perform calculations directly via `CurrencyConverter.dollarReal(...)` without creating a new object.

---
*Demonstrating architectural decisions: knowing when to instantiate objects versus when to use static utility methods.*