import java.util.*;

public class sumOfpowerofConsecutiveNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        String str = sc.nextLine();
        int[] a = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            a[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        int sum = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            sum += Math.pow(a[i], a[i + 1]);  
        }
        sum += Math.pow(a[str.length() - 1], 0);
        System.out.println("Sum of powers: " + sum);
    }
}

