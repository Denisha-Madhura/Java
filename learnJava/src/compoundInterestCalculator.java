import java.util.Scanner;

public class compoundInterestCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timeCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the Interest Rate (in %): ");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the number of times compounded per year: ");
        timeCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal*Math.pow(1+rate/timeCompounded, timeCompounded*years);
        System.out.printf("Total amount after %d years is $%.2f ", years, amount);

        scanner.close();
    }
}
