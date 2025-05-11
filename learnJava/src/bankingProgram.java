import java.util.Scanner;


public class bankingProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        //variable declaration

        double balance =0;
        boolean isRunning = true;
        int choice;

        while(isRunning) {
            //display menu
            System.out.println("**********************\nBanking Program\n**********************");
            System.out.println("1. Show balance \n2. Deposit \n3. Withdraw\n4. Exit \n**********************");

            // user choice
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
        System.out.println("**********************\nThank you! have a nice day \n**********************");
        scanner.close();
    }

    static void showBalance(double balance){
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit(){
        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount<0){
            System.out.println("Amount can't be negative");
            return 0;
        }else{
            return amount;
        }
    }

    static double withdraw(double balance){
        double amount;

        System.out.print("Enter an amount to be withdrawn:");
        amount = scanner.nextDouble();

        if(amount<0){
            System.out.println("Amount can't be negative");
            return 0;
        }else if(amount>balance){
            System.out.println("Insufficient funds");
            return 0;
        }
        else{
            return amount;
        }
    }
}
