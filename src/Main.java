import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance;
        boolean isRunning = true;
        int choice;

        System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("***************");

        System.out.print("Enter your choice (1-4): ");
        choice = scanner.nextInt();
        System.out.println(choice);
        scanner.close();
    }
}