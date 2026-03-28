# 🛡️ Constructors, 'this' keyword, Overloading, and Encapsulation

Transitioning towards robust object-oriented design by protecting the internal state of objects.
*Based on Dr. Nelio Alves' Java Course.*

## 🧠 Key Concepts Applied
* **Encapsulation:** Hiding the internal state of an object using the `private` access modifier and exposing only safe operations via `getters` and `setters`.
* **Constructors:** Special methods executed upon object instantiation, used to initialize attributes and enforce mandatory data.
* **Overloading:** Providing multiple constructors (or methods) with the same name but different parameter lists.
* **The `this` keyword:** A reference to the current object itself, highly useful for distinguishing class attributes from local variables/parameters.

## 📋 Scenarios Implemented

### 1. Product Stock (Refactored)
The previous Product entity was refactored to comply with encapsulation rules.
* Attributes are now inaccessible directly from the main program.
* Instantiating a `Product` now requires specific parameters via a custom constructor, preventing the creation of "empty" or invalid products.

---
*Ensuring data integrity and building safe, reliable backend structures.*