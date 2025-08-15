\# Inventory Management System (Java + MySQL + JDBC)



A complete Inventory Management System built using \*\*Java Swing\*\*, \*\*JDBC\*\*, and \*\*MySQL\*\*.  

This project allows businesses to manage products, customers, stock, purchases, and sales efficiently.  



---



\## 🚀 Features



\- \*\*User Authentication\*\*: Secure login system with password verification.

\- \*\*Dashboard\*\*: Navigation between modules using `CardLayout`.

\- \*\*Product Management\*\*: Add, edit, and delete products with quantity and pricing details.

\- \*\*Stock Management\*\*: View current stock with automatic updates after purchase/sale.

\- \*\*Sales Module\*\*: Record and track sales transactions.

\- \*\*Customer Management\*\*: Maintain customer details for billing and communication.

\- \*\*Database Connectivity\*\*: Uses JDBC to connect to MySQL.

\- \*\*Background Images \& UI Styling\*\* for a modern look.



---



\## 🖥️ Tech Stack



\- \*\*Language\*\*: Java (Swing for GUI)

\- \*\*Database\*\*: MySQL

\- \*\*Connectivity\*\*: JDBC

\- \*\*IDE\*\*: IntelliJ IDEA

\- \*\*Version Control\*\*: Git



---



\## 📂 Project Structure

src/ # All Java source files
├── dao/ # Database access classes
├── dto/ # Data transfer objects
├── db/ # Database connection factory
├── ui/ # User interface frames & panels
database/ # SQL file for database creation
assets/ # Images, icons

---

## ⚙️ Installation & Setup

### 1️⃣ Prerequisites
- Install [Java JDK 8+](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
- Install [MySQL Server](https://dev.mysql.com/downloads/mysql/)
- Install [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)

### 2️⃣ Database Setup
1. Open MySQL and create the database:
```sql
CREATE DATABASE inventory_management;
2. Import the provided SQL file:
mysql -u root -p inventory_management < database/inventory_management.sql
3️⃣ Configure Database Connection

Edit ConnectionFactory.java:

private static final String URL = "jdbc:mysql://127.0.0.1:3306/inventory_management";
private static final String USER = "root";
private static final String PASSWORD = "Bsk001123@";

4️⃣ Run the Project

Open the project in IntelliJ IDEA

Build & run Main.java


---

## **3. License**
If you want people to freely use and modify your code, add an **MIT License** (`LICENSE` file):
```txt
MIT License

Copyright (c) 2025 Bhargav Karande

Permission is hereby granted, free of charge, to any person obtaining a copy...
