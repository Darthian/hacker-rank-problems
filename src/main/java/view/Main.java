package view;

import static service.PrefixService.evaluatePrefix;
import static service.TreeService.createTree;

public class Main {
    public static void main(String[] array) {
        displayMenu();
    }

    public static String solveProblem(String[] array) {
        StringBuilder prefix = new StringBuilder();
        if (array != null && array.length > 0) {
            return evaluatePrefix(array, prefix, 0, 0);
        } else {
            return "";
        }
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Solve Problem");
        System.out.println("2. Tree Problem");
        System.out.println("0. Exit");

        System.out.print("Enter your choice: ");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String inputString = scanner.next();
        int choice = -1;
        try {
            choice = Integer.parseInt(inputString);
        }   catch (NumberFormatException e) {
            System.out.println("Invalid choice. Please try again.");
        }

        switch (choice) {
            case 0:
                break;
            case 1:
                System.out.println("Enter the array elements separated by space:");
                scanner.nextLine(); // consume newline
                String input = scanner.nextLine();
                String[] array = input.split(" ");
                System.out.println("Result: " + solveProblem(array));
                displayMenu();
                break;
            case 2:
                createTree();
                displayMenu();
                break;
            default:
                displayMenu();
                break;
        }
    }
}
