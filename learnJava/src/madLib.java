import java.util.Scanner;

public class madLib{
    public static void main(String[] args) {
        // MAD LIB GAME
        Scanner sc = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = sc.nextLine();
        System.out.print("Enter a noun(person/ animal): ");
        noun1 = sc.nextLine();
        System.out.print("Enter a second adjective: ");
        adjective2 = sc.nextLine();
        System.out.print("Enter a verb(with ing in the end): ");
        verb1 = sc.nextLine();
        System.out.print("Enter a third adjective: ");
        adjective3 = sc.nextLine();

        System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and  " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        sc.close();


    }
}

//OUTPUT:

//"C:\Program Files\Java\jdk-24\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1\lib\idea_rt.jar=50692" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\denis\OneDrive - vit.ac.in\Desktop\Library\Coding\Java\learnJava\out\production\learnJava" madLib
//Enter an adjective (description): funny
//Enter a noun(person/ animal): tiger
//Enter a second adjective: goofy
//Enter a verb(with ing in the end): snoring
//Enter a third adjective: happy
//
//Today I went to a funny zoo.
//In an exhibit, I saw a tiger.
//tiger was goofy and  snoring!
//I was happy!
//
//Process finished with exit code 0
