# 20 - Generics, Set, Map

This module focuses on the study and practical application of **Generics**, **Collections (Set)**, and **Maps (Map)** in Java. The main goal is to understand how these data structures manage memory, optimize lookups, and ensure type safety during compile time.

---

## 🚀 Practical Exercise: Unique Students Controller (Set Interface)

Located at: `20-Generics-Set-Map/Set-exercise`

### 📝 Problem Description
An online course portal needs to calculate the total number of unique students for a specific instructor. The instructor teaches three courses: A, B, and C. Each student is represented by a unique ID (integer). Since a student can be enrolled in multiple courses at the same time, simply summing up the total attendees from each class would generate duplicate counts.

The program reads the student IDs for all three courses, filters out any duplicates efficiently, and displays the total number of unique students.

### 🛠️ Technical Concepts Applied
* **`HashSet`**: Chosen to store the students because it offers excellent performance ($O(1)$ constant time for insertions and lookups in ideal scenarios) and natively prevents duplicate entries.
* **Overriding `hashCode()` & `equals()`**: Custom-implemented within the `User` class using the `unicNumber` identifier. This ensures that the `HashSet` knows exactly when two distinct memory objects represent the same actual student, successfully discarding clones.
* **Architecture & Modularization**: Clear separation of concerns between the `application` package (program entry point and I/O handling) and the `entities` package (domain models and core rules).
