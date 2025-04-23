import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        try {
            Double.parseDouble(str); // Try converting the string to a number
            System.out.println(str + " is a valid number.");
        } catch (NumberFormatException e) {
            System.out.println(str + " is NOT a valid number.");
        }
    }
}

