import java.util.Scanner;

public class ATMProject {

    // BankAccount class
    static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println(" Deposit successful. Amount: ₹" + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println(" Invalid withdrawal amount.");
            } else if (amount > balance) {
                System.out.println(" Insufficient balance. Available: ₹" + balance);
            } else {
                balance -= amount;
                System.out.println(" Withdrawal successful. Amount: ₹" + amount);
            }
        }

        public double getBalance() {
            return balance;
        }
    }

    // ATM methods
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000.0); // Initial balance

        System.out.println("💳 Welcome to the ATM Machine!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ₹");
                    try {
                        double amount = Double.parseDouble(scanner.nextLine());
                        account.withdraw(amount);
                    } catch (NumberFormatException e) {
                        System.out.println(" Invalid amount.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    try {
                        double amount = Double.parseDouble(scanner.nextLine());
                        account.deposit(amount);
                    } catch (NumberFormatException e) {
                        System.out.println(" Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.println(" Current balance: ₹" + account.getBalance());
                    break;

                case 4:
                    System.out.println( "Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println(" Invalid choice. Please select from 1 to 4.");
            }
        }
    }
}
