import java.util.Scanner;
public class titleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = sc.nextLine().toLowerCase();
        String[] words=str1.split(" ");
        StringBuilder titleCase=new StringBuilder();
        for(String word: words){
            if(!word.isEmpty()){
                titleCase.append(Character.toUpperCase(word.charAt(0)));
                titleCase.append(word.substring(1));
                titleCase.append(" ");
            }
        }
        System.out.println(titleCase);
     }
}
