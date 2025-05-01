import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double weight;
        double convertedWeight;

        System.out.print("Weight Conversion program\n1: Convert lbs to kgs\n2:Convert kgs to lbs\nChoose an option: ");
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            convertedWeight = weight / 2.20462;
            System.out.printf("Converted weight in kgs is %.2f", convertedWeight);
        } else if (choice == 2) {
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            convertedWeight = weight * 2.20462;
            System.out.printf("Converted weight in lbs is %.2f", convertedWeight);
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();

    }
}
