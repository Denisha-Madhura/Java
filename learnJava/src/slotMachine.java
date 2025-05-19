import java.util.Scanner;
import java.util.Random;

public class slotMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain = "y";


        System.out.println("***************************");
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐ " );
        System.out.println("***************************");

        while(balance>0){
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if(bet>0 && bet<balance){
                balance -= bet;
                System.out.println("Spinning....");
                row = spinRow();
                printRow(row);
                payout = getPayout(row, bet);
                if(payout>0){
                    System.out.println("You won $" + payout );
                    balance += payout;
                }else{
                    System.out.println("You lost");
                }

            }else if(bet>balance){
                System.out.println("Insufficient funds");
                continue;
            }else{
                System.out.println("Bet must be greater than 0");
                continue;
            }

            System.out.print("Do you want to play again(Y/n)?: ");
            playAgain = scanner.nextLine().toLowerCase();

            if(!playAgain.equals("y")){
                break;
            }
        }

        System.out.println("GAME OVER! Your final balance is: $" + balance + "\nThank you for playing!");

        scanner.close(); 
    }

    static String[] spinRow(){
        String[] symbols = {"🍒", "🍉", "🍋",  "🔔",  "⭐"};
        String[] row = new String[3];
        Random random = new Random();
        row = new String[]{symbols[random.nextInt(0, 5)], symbols[random.nextInt(0, 5)], symbols[random.nextInt(0,5)]};
        return row;
    }

    static void printRow(String[] row){
        System.out.println("******************************");
        System.out.println(" " + String.join((" | "), row));
        System.out.println("******************************");
    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }

        else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }

        else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }

        else{
            return 0;
        }
    }
}


