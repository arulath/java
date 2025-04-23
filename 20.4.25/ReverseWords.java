import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" "); // Split the sentence into words
        String reversedSentence = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i] + " "; // Add words in reverse order
        }

        System.out.println("Reversed sentence: " + reversedSentence.trim());
    }
}
