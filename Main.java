import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Exercise 6 — Even / Odd
        System.out.print("Enter number: ");
        int num = Integer.parseInt(inputScanner.nextLine());

        if (num%2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        System.out.println("----------------------");

        // Exercise 7 — Grade Calculator
        System.out.print("Enter score: ");
        int score = Integer.parseInt(inputScanner.nextLine());
        if (score > 100 || score < 0)  {
            System.out.println("Invalid score");
        } else {
            if (score >= 80) {
                System.out.println("Grade A");
            } else if (score >= 70) {
                System.out.println("Grade B");
            } else if (score >= 60) {
                System.out.println("Grade C");
            } else if (score >= 50) {
                System.out.println("Grade D");
            } else {
                System.out.println("Grade F");
            }
        }

        System.out.println("----------------------");

        // Exercise 8 — Discount Calculator
        System.out.print("Purchase amount: ");
        int buy = Integer.parseInt(inputScanner.nextLine());

        if (buy >= 3000) {
            double discount = (buy * 0.15);
            System.out.println("Final price: " + (buy - discount));
        } else if (buy >= 1500) {
            double discount = (buy * 0.10);
            System.out.println("Discount: " + discount);
            System.out.println("Final price: " + (buy - discount));
        } else if (buy >= 500) {
            double discount = (buy * 0.05);
            System.out.println("Discount: " + discount);
            System.out.println("Final price: " + (buy - discount));
        } else {
            double discount = (buy * 0);
            System.out.println("Discount: " + discount);
            System.out.println("Final price: " + (buy - discount));
        }

        inputScanner.close();
    }
}
