import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.nextLine();

        String reversed = "";
        for(int i=word.length()-1;i>=0;i++){
          reversed+=word.charAt(i);
        }
        if(word.equalsIgnoreCase(reversed)){
            System.out.println("yes !");
        }
        else{
            System.out.println("no!");
        }
    }
}