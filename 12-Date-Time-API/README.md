# 📅 Java Date & Time API

A complete practical study and reference guide for manipulating dates, times, and timezones using the modern `java.time` API introduced in Java 8.

## 🎯 Objective
To explore and master the standard operations required for real-world backend applications, including time instantiation, string parsing, global timezone conversions, and duration math.

## 🧠 Key Concepts Applied
* **Local vs Global Time:** Understanding the difference between `LocalDate`/`LocalDateTime` (context-less time) and `Instant` (UTC timezone-aware time).
* **Data Formatting:** Utilizing `DateTimeFormatter` to parse strings into date objects and format dates back into user-friendly strings (e.g., `dd/MM/yyyy HH:mm`).
* **Time Math & Durations:** Calculating the exact time elapsed between two moments using `Duration.between()` and manipulating dates with `minusDays()` and `plusDays()`.
* **Timezones:** Converting global `Instant` timestamps into specific regional times using `ZoneId`.

---
*Fundamental module for handling event logging, scheduling, and time-based calculations.*