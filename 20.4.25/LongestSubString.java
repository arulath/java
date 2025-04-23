import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean[] visited = new boolean[256]; // Array to track visited characters
            for (int j = i; j < str.length(); j++) {
                char currentChar = str.charAt(j);

                if (visited[currentChar]) {
                    break; // If character is repeated, break out of the loop
                }

                visited[currentChar] = true;
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }

        System.out.println("Length of the longest substring without repeating characters: " + maxLength);
    }
}

