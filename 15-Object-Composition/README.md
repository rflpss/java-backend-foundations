# 🛒 Product Order System (Object Composition & Enums)

A practical implementation of an e-commerce order management system using advanced object composition and enumerations in Java.

## 🎯 Objective
To build a system that processes a customer's order, containing multiple product items, calculates total costs, and displays a complete summary with order statuses.

## 🧠 Concepts Applied
* **Complex Object Composition:** Connecting multiple entities where an `Order` has a `Client` (1-to-1) and a list of `OrderItem` objects (1-to-many), and each item references a `Product`.
* **Enumerations (Enums):** Managing the life cycle of an order using `OrderStatus` (`PENDING_PAYMENT`, `PROCESSING`, `SHIPPED`, `DELIVERED`).
* **StringBuilder:** Efficiently formatting large blocks of text and nested object data to print a clean, professional order summary.
* **Data Structures:** Using `List<OrderItem>` to dynamically add and manage items inside a single order.