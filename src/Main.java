import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);  // Declared in class scope so all methods can use it
    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;
        int choice;
        while(isRunning) {
            System.out.println("\n***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> System.out.println("WITHDRAW");
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        scanner.close();
    }

    static void showBalance(double balance){
        System.out.printf("£%.2f\n", balance);
        /*
        %.2f is for floating point to two digits after the decimal
        \n for new line
        */
    }

    static double deposit(){ // double means it will return a value (of type double)
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("ERROR: Amount cannot be negative!");
            return 0;
        }
        else{
            return amount;
        }
    }
}