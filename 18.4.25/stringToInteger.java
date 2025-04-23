import java.util.Scanner;

public class stringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as a string: ");
        String str = sc.nextLine();

        try {
            int number = Integer.parseInt(str);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
    }
}
