# 📀 Vintage Vinyl's: E-Commerce API

---

## ✨ Project Description
**Vintage Vinyl's** is a specialized music store API designed for vinyl enthusiasts and equipment collectors. As a backend developer, I took an existing Version 1 application and transformed it into a reliable, feature-rich platform. My work focused on stabilizing the product catalog, securing administrative routes, and building out the shopping cart and checkout experience.

## 🛠️ Tech Stack
* **Language:** Java (Spring Boot)
* **Database:** MySQL
* **Tools:** Postman for API testing, GitHub Projects for management, and MySQL Workbench for database execution.
* **Security:** JWT (JSON Web Tokens) for authenticated sessions and role-based access.

## 🚀 Key Features & Bug Fixes
> ### 💬User Stories:
>> "As a vinyl collector I want be able to search by price, so that I can make sure I get the best deal on a record."
>> <br><br>
>> "As an in-person shopper I want to be able to see what is available, so that I can know what is in stock before I arrive."

### 🐞 Catalog Stabilization
* **Search Accuracy:** Resolved issues where the record search returned incorrect results. Now, customers can filter by category, price range, and subcategories.


## 🚦 API Reference
| Method | Endpoint | Description | Access |
| :--- | :--- | :--- | :--- |
| **GET** | `/products` | Browse the vinyl collection | All |
| **PUT** | `/products/{id}` | Update record details | Admin Only |
| **GET** | `/categories` | List all product categories | All |

--- 



