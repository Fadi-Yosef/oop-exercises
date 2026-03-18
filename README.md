# OOP Exercises (Java)

This project contains a set of Object-Oriented Programming (OOP) exercises implemented in Java.
It demonstrates key OOP concepts such as encapsulation, constructors, getters/setters, and object relationships.

---

## 📌 Concepts Covered

* Encapsulation (private fields)
* Constructors
* Getters and Setters
* Object methods
* Relationships between classes (One-to-Many)

---

## 📁 Project Structure

```
src/
 └── oop/
     ├── BankAccount.java
     ├── Customer.java
     ├── Student.java
     ├── Product.java
     ├── Order.java
     └── Main.java
```

---

## ▶️ How to Run

1. Open the project in IntelliJ IDEA
2. Navigate to `Main.java`
3. Run the program
4. View output in the console

---

## 🧪 Exercises

### 🔹 Exercise 1 – BankAccount

**Description:**
Represents a bank account with deposit and withdrawal operations.

**UML Diagram:**

```
+---------------------------+
|        BankAccount        |
+---------------------------+
| - accountHolder: String   |
| - balance: double         |
+---------------------------+
| + deposit(amount): void   |
| + withdraw(amount): void  |
+---------------------------+
```

---

### 🔹 Exercise 2 – Customer

**Description:**
Represents a customer with personal details.

**UML Diagram:**

```
+---------------------------+
|         Customer          |
+---------------------------+
| - customerId: int         |
| - name: String            |
| - email: String           |
+---------------------------+
| + getters/setters         |
+---------------------------+
```

---

### 🔹 Exercise 3 – Student

**Description:**
Represents a student with academic information.

**UML Diagram:**

```
+---------------------------+
|          Student          |
+---------------------------+
| - studentId: int          |
| - name: String            |
| - age: int                |
| - major: String           |
+---------------------------+
| + getters/setters         |
+---------------------------+
```

---

### 🔹 Exercise 4 – Product

**Description:**
Represents a product with a price.

**UML Diagram:**

```
+---------------------------+
|          Product          |
+---------------------------+
| - productId: int          |
| - name: String            |
| - price: double           |
+---------------------------+
| + getters/setters         |
+---------------------------+
```

---

### 🔹 Exercise 5 – Order

**Description:**
Represents an order that contains multiple products.

**Relationship:**
One Order → Many Products

**UML Diagram:**

```
+---------------------------+
|           Order           |
+---------------------------+
| - products: List<Product> |
+---------------------------+
| + addProduct(p): void     |
| + removeProduct(p): void  |
| + calculateTotal(): double|
+---------------------------+
```

---

## 👨‍💻 Author

Fadi Yosef

---

## 📎 Notes

* `.idea/` folder is ignored using `.gitignore`
* Project is for educational purposes
* Demonstrates basic OOP principles in Java

---
