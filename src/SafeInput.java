import java.util.Scanner;
public class SafeInput {
    public static int getRangedInt(String prompt, int low, int high) {
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        while (input < low || input > high) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input < low || input > high) {
                    System.out.println("Please enter a value between " + low + " and " + high + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }
        return input;
    }
}
