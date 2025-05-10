import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min;
        int max;


        System.out.println("Number guessing game");
        System.out.print("Enter the min limit: ");
        min = scanner.nextInt();
        System.out.print("Enter the max limit: ");
        max = scanner.nextInt();
        int randomNo = random.nextInt(min, max+1);
        System.out.printf("Guess a number between %d -%d: \n", min, max);
        

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNo){
                System.out.println("TOO LOW, TRY AGAIN!");
            }else if(guess>randomNo){
                System.out.println("TOO HIGH, TRY AGAIN!");
            }else{
                System.out.println("YOU HAVE WON");
                System.out.println("NO. OF ATTEMPTS: " + attempts);
            }

        }while(guess!=randomNo);

        scanner.close();

    }
}
