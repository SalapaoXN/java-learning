import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercise 3 — User Profile
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter your university: ");
        String university = scanner.nextLine();

        System.out.print("Enter your study year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old.");
        System.out.println("University: " + university);
        System.out.println("Year: " + year);

        System.out.println("--------------------------------");

        // Exercise 4 — Age Calculator
        System.out.println("Next year you will be " + (age+1) +  " years old.");

        System.out.println("--------------------------------");

        // Exercise 5 — Rectangle Calculator
        System.out.print("Width: ");
        int width = scanner.nextInt();

        System.out.print("Height: ");
        int height = scanner.nextInt();

        System.out.println("Area : " + width * height);
        System.out.println("Area : " + (2 * (width + height)));
        scanner.close();
    }
}
