# Java Variables & Data Types 📦

Notes on how to store data in memory using Java.

## 1. Strongly Typed Language
Java requires you to define the **type** of data before the variable name.

## 2. Main Data Types (Primitives & Classes)

| Type | Description | Example | Size/Note |
| :--- | :--- | :--- | :--- |
| **int** | Integer numbers (no decimals) | `int age = 25;` | 32-bit |
| **double** | Decimal numbers | `double price = 10.50;` | Use dot `.` not comma |
| **char** | Single character | `char gender = 'M';` | Use single quotes `' '` |
| **boolean**| True or False | `boolean isDev = true;` | Logic control |
| **String** | Text | `String name = "Raf";` | **Uppercase 'S'**, double quotes `" "` |

> **Important:** `String` is a Class, not a primitive type. That's why it starts with an uppercase letter!

---

## 3. Output & Formatting (Exercise) 🖨️
Practice using `System.out.printf` to format data.

### formatting Markers:
| Marker | Type | Example |
| :--- | :--- | :--- |
| **%s** | String (Text) | `printf("Name: %s", name);` |
| **%d** | Integer (int) | `printf("Age: %d", age);` |
| **%f** | Floating point | `printf("Price: %.2f", price);` |
| **%n** | Line Break | Always use `%n` inside printf for new line |

### 🌍 Locale Trick
To change decimal separator from **Comma (,)** to **Dot (.)**:
```java
import java.util.Locale;
// ... inside main
Locale.setDefault(Locale.US);
System.out.printf("%.3f", measure); // Output: 53.235