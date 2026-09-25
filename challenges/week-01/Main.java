public class Main {
    public static void main(String[] args) {
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Unknown");
        }

        String role = "admin";

        switch (role) {
            case "admin" -> System.out.println("Full access");
            case "user" -> System.out.println("Normal access");
            default -> System.out.println("Unknown role");
        }
    }
}
