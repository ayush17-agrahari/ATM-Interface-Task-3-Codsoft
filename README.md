# ATM-Interface-Task-3-Codsoft
This is a simple Java-based ATM Simulation Project developed as part of the CodSoft Internship Program. The project demonstrates how to design an ATM interface using object-oriented programming concepts in Java. It simulates core ATM functionalities like withdrawing money, depositing funds, and checking account balance.

📌 Project Objectives
Simulate an ATM machine using a command-line interface.

Create a system with basic banking operations.

Apply Java concepts like classes, methods, encapsulation, input validation, and user interaction.

🧱 Project Structure
Class	Description
BankAccount	Represents the user's bank account. Stores and manages the balance.
ATMProject	Handles user interface, options menu, and connects to the BankAccount.

🧮 Features Implemented
✅ Withdraw Money: Deducts amount if sufficient balance exists.

✅ Deposit Money: Adds a valid amount to the account.

✅ Check Balance: Displays the current account balance.

✅ Input Validation: Prevents invalid or negative transactions.

✅ User Feedback: Provides success/failure messages for every transaction.

✅ Looped Menu: Users can perform multiple operations until they exit.

🖥️ User Interface (Console-Based)
bash
Copy
Edit
💳 Welcome to the ATM Machine!

Choose an option:
1. Withdraw
2. Deposit
3. Check Balance
4. Exit
Enter your choice: 1
Enter amount to withdraw: ₹500
✅ Withdrawal successful. Amount: ₹500
📌 Java Concepts Used
Scanner class for input

Random class (optional for PIN or session ID)

Encapsulation (private balance with public getters/setters)

Method-based code structure (deposit(), withdraw(), etc.)

Loops and control structures (while, switch-case, try-catch)

🧠 Learning Outcomes
How to structure classes and connect them logically

Implement real-world banking logic in code

Handle user input and validation

Build a menu-driven Java application

Understand OOP principles like encapsulation and method reuse

OUTPUT:
💳 Welcome to the ATM Machine!

Choose an option:
1. Withdraw
2. Deposit
3. Check Balance
4. Exit
Enter your choice: 3
💰 Current balance: ₹1000.0

Choose an option:
1. Withdraw
2. Deposit
3. Check Balance
4. Exit
Enter your choice: 2
Enter amount to deposit: ₹5000
✅ Deposit successful. Amount: ₹5000.0

Choose an option:
1. Withdraw
2. Deposit
3. Check Balance
4. Exit
Enter your choice: 1
Enter amount to withdraw: ₹2000
✅ Withdrawal successful. Amount: ₹2000.0

Choose an option:
1. Withdraw
2. Deposit
3. Check Balance
4. Exit
Enter your choice:
