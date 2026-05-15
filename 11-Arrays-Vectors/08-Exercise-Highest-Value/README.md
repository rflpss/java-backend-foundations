# 📈 Maximum Value and Index Tracker

A Java program that implements a fundamental search algorithm to locate the highest value within a one-dimensional array.

## 🎯 Objective
To populate an array with floating-point numbers provided by the user, and then parse the array to find the maximum value and the specific position (index) where that value is stored.

## 🧠 Key Concepts Applied
* **Baseline Initialization:** Setting the initial comparison values (`higherValue` and `higherPosition`) to the first element of the array (`index 0`) to ensure accurate evaluation regardless of the input data range.
* **Value Comparison:** Using an `if` statement inside a loop to dynamically update the maximum value variable whenever a larger element is encountered.
* **Index Tracking:** Storing the current loop iteration variable (`i`) into a separate state variable (`higherPosition`) to remember exactly where the maximum value was found.