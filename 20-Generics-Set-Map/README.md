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

---

## 🗳️ Practical Exercise: Election Vote Consolidator (Map Interface)

Located at: `20-Generics-Set-Map/Map-exercise`

### 📝 Problem Description
An application designed to read an election voting log file (.csv format) containing candidate names and the corresponding amount of votes obtained across multiple voting urns. The program reads the logs sequentially, automatically aggregates the tallies for repeating candidates, and generates a consolidated report showing the finalized total scores.

### ⚙️ Technical Concepts Applied
* **`HashMap`**: Chosen to establish a structural key-value link between candidate names (unique keys) and their accumulating vote counts (values), providing efficient lookups and updates.
* **`File I/O Streaming`**: Implemented a robust `BufferedReader` system within a `try-with-resources` block to safely read external text logs line-by-line.
* **`String Tokenization`**: Employed the `.split(",")` method to parse the comma-separated records, effectively parsing the raw lines into identity strings and numeric values.