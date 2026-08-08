import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 1000;

        while (true) {
            System.out.println("\n=== ATM MENU ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Balance: " + balance);
            } 
            else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();
                balance = balance + amount;
                System.out.println("Deposit successful!");
            } 
            else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();

                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Withdrawal successful!");
                } else {
                    System.out.println("Insufficient balance!");
                }
            } 
            else if (choice == 4) {
                System.out.println("Thank you!");
                break;
            } 
            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
