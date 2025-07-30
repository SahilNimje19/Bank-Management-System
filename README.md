# 🏦 Bank Management System | Java Swing 💳
Bank Management System


A desktop-based **Bank Management System** built using **Java Swing**, simulating the core features of an ATM.  
It includes secure login, deposit/withdrawal features, mini-statements, and multi-step signup processes — all through a clean, interactive UI.


## 🔑 Key Features

- 🔐 Secure login with account verification  
- 📝 Multi-step user signup (3-stage form flow)  
- 💰 Deposit & Withdraw money  
- 💳 Check account balance  
- 📄 Mini statement generation  
- 🔄 Fast cash withdrawal options  
- 🔧 PIN change functionality  
- 🎨 GUI built with **Java Swing**  
- 🔌 Database connectivity via JDBC



## 🧠 Tech Stack

| Component    | Technology       |
|--------------|------------------|
| Frontend     | Java Swing       |
| Backend      | Java (Core OOP)  |
| Database     | MySQL (via JDBC) |
| Architecture | MVC-based design |



## 🔄 Application Workflow

This Bank Management System simulates an ATM-like experience for users. Here's how the application works:

### 🏁 1. Application Launch
- The program starts by running the `Main.java` file.
- It opens a **Login Interface** where users can either log in or proceed to sign up.

### 📝 2. User Registration (3-Step Signup)
- If the user is new, they go through:
  - `SignupOne.java` – collects personal details.
  - `SignupTwo.java` – captures account preferences (account type, card number).
  - `SignupThree.java` – asks for PIN setup and services selection.
- Data is stored in the connected **MySQL database**.

### 🔐 3. Login
- Existing users enter their **card number and PIN** to log in.
- The system validates credentials using the database (`Login.java`).

### 💳 4. User Dashboard (ATM Features)
Once logged in, users can:

- 💰 **Deposit** money – via `Deposite.java`
- 💸 **Withdraw** money – via `Withdrawl.java`
- 🕒 **Fast Cash** – quick fixed withdrawals from `FastCash.java`
- 📋 **Mini Statement** – recent transactions from `MiniStatement.java`
- 🔁 **PIN Change** – update card PIN using `PinChange.java`
- 🧾 **Balance Enquiry** – view account balance (`BalanceEnquiry.java`)
- 📤 **Logout** – exit the session

### 🧠 5. Backend Operations
- All features interact with the backend database using the JDBC connection (`Conn.java`).
- Each operation executes corresponding SQL queries like `INSERT`, `UPDATE`, and `SELECT`.



## ✅ Summary

- Modular design using object-oriented Java.
- GUI handled via Java Swing.
- Database operations via JDBC.
- Clean workflow mimicking real-world ATM experience.



## ✅ Features To Be Added

- 📦 Add user profile image upload  
- 🔔 Email or SMS-based notifications  
- 📊 Admin dashboard for all users  
- 🛡️ Enhanced security and encryption  
- 🌐 Web version using Spring Boot (future scope)

