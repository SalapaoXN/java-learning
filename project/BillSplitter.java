import java.util.Scanner;

public class BillSplitter {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter food price: ");
        double subtotal = Double.parseDouble(inputScanner.nextLine());

        System.out.print("Enter number of people: ");
        int people = Integer.parseInt(inputScanner.nextLine());

        System.out.print("Enter service charge (%): ");
        double serviceCharge = Double.parseDouble(inputScanner.nextLine());

        System.out.print("Enter VAT (%): ");
        double vat = Double.parseDouble(inputScanner.nextLine());

        System.out.print("Enter discount (%): ");
        double discount = Double.parseDouble(inputScanner.nextLine());

        if (subtotal <= 0 || 
            people <= 0 || 
            serviceCharge > 100 || serviceCharge < 0 || 
            vat > 100 || vat < 0 || 
            discount > 100 || discount < 0) {
                System.out.println("Invalid input");
        } else {
            System.out.println("----- BILL SUMMARY -----");

            double serviceChargeCost = (subtotal * serviceCharge / 100);
            double afterService = (subtotal + serviceChargeCost);

            double vatCost = (afterService * vat / 100);
            double beforeDiscount = (afterService + vatCost);

            double discountCost = (beforeDiscount * discount / 100);
            double finalTotal = (beforeDiscount - discountCost);
            double finalPerson = (finalTotal / people);

            System.out.printf("Subtotal: %.2f%n", subtotal);
            System.out.printf("Service Charge: %.2f%n", serviceChargeCost);
            System.out.printf("VAT: %.2f%n", vatCost);
            System.out.printf("Discount: %.2f%n", discountCost);
            System.out.printf("Final Total: %.2f%n", finalTotal);
            System.out.printf("Price per Person: %.2f%n", finalPerson);
        }

        inputScanner.close();
    }
}
