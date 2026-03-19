# 📦 Object-Oriented Programming (OOP) - Basics

First deep dive into OOP concepts using Java. Transitioning from procedural code to object-oriented design by separating entities and execution logic.
*Based on Dr. Nelio Alves' Java Course.*

## 🧠 Key Concepts Applied
* **Classes and Objects:** Instantiating objects to hold their own state and behavior.
* **Encapsulation (Intro):** Grouping related variables (attributes) and functions (methods) into a single entity.
* **Packages Organization:** Structuring the code professionally by separating `application` (for the main execution flow) and `entities` (for the domain models).
* **State Manipulation:** Updating object attributes dynamically using dedicated methods.

## 📋 Scenarios Implemented

### 1. Rectangle Calculator
An algorithm that instantiates a `Rectangle` object based on user input (width and height) and calculates mathematical properties.
* **Methods:** `area()`, `perimeter()`, `diagonal()` (using `Math.sqrt`).

### 2. Product Stock Management
A basic inventory system to manage a `Product` entity.
* **Features:** - Calculates total value in stock based on price and quantity.
  - Dynamically updates the stock state (`addProducts()` and `removeProducts()`).
  - Custom `toString()` override to format and display the object's current state cleanly.

---
*Building the foundation for robust Backend Systems.*