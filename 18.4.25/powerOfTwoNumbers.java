import java.util.Scanner;

public class powerOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num <= 0) {
            System.out.println( "NOT a power of 2.");
            return;
        }
        boolean isPowerOfTwo = true;
        while (num > 1) {
            if (num % 2 != 0) {
                isPowerOfTwo = false;
                break;
            }
            num = num / 2;
        }
        if (isPowerOfTwo) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

