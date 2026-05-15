# 📦 Memory Behavior: Arrays (Vectors)

This module explores the fundamentals of data structures in Java using one-dimensional arrays (vectors). The focus is on understanding how Java allocates memory for different array types.

## 🧠 Key Concepts Applied

* **Arrays of Primitive Types:** Storing basic data directly within the array structure. The array acts as a continuous block of memory holding the actual values (e.g., `double`).
* **Arrays of Reference Types:** Creating an array of objects. The array does not store the objects themselves, but rather the memory addresses (references) pointing to where the objects are stored in the Heap.
* **Iteration:** Using `for` loops bounded by the `array.length` property to safely traverse and manipulate data.

## 📋 Scenarios Implemented

### 1. Primitives Array (Heights)
A simple program that reads an `N` number of people's heights, stores them in a `double[]` array, and calculates the overall average height.

### 2. Objects Array (Products)
A more complex scenario that instantiates an array of custom `Product` entities. 
- It requires a two-step instantiation process: first, creating the array structure in memory, and then instantiating each individual `Product` object within the array positions.
- Solves the common input buffer issue when using `Scanner` to read text immediately after a numeric input.

---
*Scaling from single-object manipulation to managing collections of data.*