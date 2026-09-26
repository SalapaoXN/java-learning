import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = Integer.parseInt(scanner.nextLine());
        
        double total = 0;
        double max = 0;
        double min = 999;

        if (subjects > 0) {
            for (int i = 1; i <= subjects; i++) {
                System.out.print("Score " + i + ": ");
                double score = Double.parseDouble(scanner.nextLine());

                if (score < 0 || score > 100) {
                    System.out.println("Score must be between 0 and 100!");
                    scanner.close();
                    return;
                }

                total += score;
                if (score > max) {
                    max = score;
                }
                if (score < min) {
                    min = score;
                }
            }
            
            double average = getAverage(total, subjects);
            char grade = getGrade(average);
            
            System.out.println("----- RESULT -----");
            System.out.print("Average: " + String.format("%.2f%n", average));
            System.out.println("Highest: " + max);
            System.out.println("Lowest: " + min);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Subjects should be more than 0!");
        }

        scanner.close();
    }

    public static double getAverage(double total, int subjects) {
        return total / subjects;
    }

    public static char getGrade(double average) {
        char result = ' ';
        if (average >= 80) {
            result = 'A';
        } else if (average < 80 && average >= 70) {
            result = 'B';
        } else if (average < 70 && average >= 60) {
            result = 'C';
        } else if (average < 60 && average >= 50) {
            result = 'D';
        } else {
            result = 'F';
        }

        return result;
    }
}
