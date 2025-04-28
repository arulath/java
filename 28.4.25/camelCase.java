import java.util.*;
public class camelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();

        System.out.println("Camel Case: "+ toCamelCase(input));
    }
        public static String toCamelCase(String input) {
        String[] words=input.trim().split("\\s+");
        StringBuilder camelCase=new StringBuilder();
        for(int i=0;i<words.length;i++){
        String word=words[i];
        if(i==0){
            camelCase.append(word.toLowerCase());
        }
        else{
            camelCase.append(Character.toUpperCase(word.charAt(0)));
            camelCase.append(word.substring(1).toLowerCase());
        }
     }
        return camelCase.toString();
    }
}
