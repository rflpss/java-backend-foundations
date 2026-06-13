# 18 - File Handling: CSV Summary Generator

Exercise from Section 15 - Working with Files of the Java COMPLETO course by Prof. Nelio Alves.

## 📋 About

A program that reads a CSV file containing sold items (name, unit price, quantity), calculates the total value for each item, and generates a `summary.csv` file with the consolidated results.

## 🏗️ Project Structure

```
src/
└── application/
    └── Program.java
```

## 📐 How it works

1. Reads the source CSV file path from the user
2. Parses each line, splitting by comma into name, unit price, and quantity
3. Calculates the total value (unit price × quantity) for each item
4. Creates an `out` folder next to the source file
5. Writes the results to `out/summary.csv` in the format `name,total`

## 📄 Example

**Input (source.csv):**
```
TV LED,1290.99,1
Video Game Chair,350.50,3
Iphone X,900.00,2
Samsung Galaxy 9,850.00,2
```

**Output (out/summary.csv):**
```
TV LED,1290.99
Video Game Chair,1051.50
Iphone X,1800.00
Samsung Galaxy 9,1700.00
```

## 🧠 Concepts Practiced

- File I/O with `BufferedReader` and `BufferedWriter`
- try-with-resources
- Working with `File`, `getParent()`, and `mkdir()`
- String splitting and parsing (`split`, `Double.parseDouble`)
- Number formatting with `String.format("%.2f", ...)`