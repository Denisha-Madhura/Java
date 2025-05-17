import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("What is the price for each: ");
        price = scanner.nextDouble();
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();
        total = price*quantity;
        System.out.println("*******Bill*******");
        System.out.println("Item\tQuantity\tPrice");
        System.out.println(item + "\t" + quantity + "\t\t" + price);

        System.out.println("Total is: " + currency + total);

        scanner.close();
    }
}
