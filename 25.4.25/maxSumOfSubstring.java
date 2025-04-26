import java.util.Scanner;

public class maxSumOfSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSum = arr[0];
        int currentSum = arr[0];
        for (int i = 1; i < n; i++) {
            currentSum =Math.max(arr[i], currentSum + arr[i]);
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        System.out.println("Maximum subarray sum is: " + maxSum);
    }
}

