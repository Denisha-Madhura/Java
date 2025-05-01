import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double temp;
        String unit;
        double converted;
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        System.out.print("Enter the unit you want to convert to (C or F): ");
        unit = scanner.next().toUpperCase();
        converted = (unit.equals("C"))? (temp  - 32)*5/9 : (temp*9/5) + 32;
        System.out.printf("The temperature after conversion is %.2f °%s", converted, unit);
        scanner.close();
    }
}
