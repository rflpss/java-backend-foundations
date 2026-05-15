# 🏨 Boarding House Reservation System

A Java console application designed to manage room reservations using arrays of objects. This exercise focuses on manipulating specific array indices and handling empty memory slots safely.

## 🎯 Objective
To build a system where students can rent rooms in a boarding house. The application must store the student's name and email in a specific room number chosen by the user, and then print a report of all occupied rooms in order.

## 🧠 Key Concepts Applied
* **Direct Index Manipulation:** Instead of filling the array sequentially (0, 1, 2...), the user's input dictates exactly which array index (room number) will hold the object reference.
* **Null Checking:** Since the array is instantiated with 10 empty slots, unassigned indices contain `null`. The program iterates through the array and uses `if (vect[i] != null)` to safely extract data only from initialized objects, avoiding `NullPointerException`.
* **Object References:** The array itself does not hold the student data; it holds references pointing to `Rent` objects stored in the Heap memory.

---
*Practicing safe memory iteration and data structure management.*SSS