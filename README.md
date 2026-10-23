# 🏥 Smart Pharmacy Management System

A Java CLI-based console application designed for pharmacy inventory control, automated billing, and real-time alerts using CSV file persistence.

---

## 📌 Project Overview
The **Smart Pharmacy Management System** streamlines daily pharmacy operations. It handles stock tracking, user authentication, automated bill calculations with discounts, emergency bill cancellations, and smart notification alerts for expiring medicine.

---

## 👥 Project Team & Modules

- **Tharusha Wijesekara (Lead)** - `ICT/25/954` - *System Architecture, Main Engine & Integration*
- **Maleesha Senura** - `ICT/25/936` - *Staff & Authentication Module & Co-Integration*
- **Sachintha Mihiranga (Core Setup)** - `ICT/25/893` - *Repository Setup, Scaffolding & Inventory Module*
- **Wimansha Wijesinghe** - `ICT/25/954` - *Billing & Sales Operations Module*
- **Sachintha Dilsara** - `ICT/25/954` - *Cancellations & Notification Alerts Module*

---

## 🧩 OOP Concepts Covered

* **Encapsulation:** Used in Model classes (`Medicine`, `StaffMember`, `Bill`, `BillItem`) with `private` fields and public Getters/Setters.
* **Inheritance:** Custom exception classes extending Java's standard `Exception` class (e.g., `ExpiredMedicineException`, `OutOfStockException`).
* **Polymorphism & Abstraction:** Service layer abstractions for file handling, billing workflows, and dynamic alert evaluations.
* **Modular Software Design:** Clean separation of concerns into distinct packages (`models`, `exceptions`, `services`, `main`).

---

## ✨ Key Features

* **Role-Based Authentication:** Distinct access permissions for Cashiers and Owners.
* **Smart Inventory Management:** Automated stock tracking with Fast/Slow moving item classification.
* **Billing System:** 
  * Automatic total and 5% discount calculations.
  * Free Issue billing path for owner authorization.
* **Safety & Security:**
  * 3-minute bill cancellation with automatic stock reversal.
  * Emergency stock and 7-month advance expiry alerts.
* **Data Persistence:** All records saved in lightweight CSV format.

---

## 🛠️ System Architecture

* **Language:** Java (JDK 8 or higher)
* **Storage:** CSV (Comma Separated Values)
* **Architecture Pattern:** Modular OOP Hierarchy (`models`, `exceptions`, `services`, `main`)

---

## 🚀 How to Run

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/Tharusha5010/smart-pharmacy-system.git](https://github.com/Tharusha5010/smart-pharmacy-system.git)
