import java.util.*;
public class countWords{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence");
        String s=sc.nextLine();
        String[] words=s.trim().split("\\s+");
        System.out.println("Number of words: "+words.length);
        }
}