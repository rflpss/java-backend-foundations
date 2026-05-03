# 🏦 Bank Account Manager - Encapsulation Practice

A console-based application to manage bank accounts, built to strictly enforce Object-Oriented Programming (OOP) encapsulation principles and protect the internal state of objects.

## 🎯 Objective
To simulate a real-world scenario where data integrity is critical. The system must prevent unauthorized or inconsistent modifications to sensitive data (like the account balance or account number).

## 💼 Business Rules Implemented
1. **Immutability:** Once an account is created, the account number cannot be altered (no setter provided).
2. **Controlled Access:** The account balance can only be modified through specific, authorized actions (`deposit` and `withdraw`), never directly.
3. **Operational Fees:** Every withdrawal automatically deducts a $5.00 bank fee from the balance.
4. **Flexible Instantiation:** Accounts can be opened with a starting balance (initial deposit) or with a zero balance. The system dynamically chooses the correct constructor based on the user's input.

---
*Developed as a practical exercise to master access modifiers, constructors, and data hiding in Java.*