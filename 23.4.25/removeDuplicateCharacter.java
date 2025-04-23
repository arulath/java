import java.util.*;
public class removeDuplicateCharacter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
    System.out.println("Enter a string:"); 
    String str=scanner.nextLine();
    String[] words=str.split(" ");
    int count=0;
    for(int i=0;i<words.length;i++){
       String word=words[i];
       String a=new String();
       boolean[] visited=new boolean[256];
       for(int j=0;j<word.length();j++){
        char ch=word.charAt(j);
        if (!visited[ch]) {
          visited[ch]=true;
          a += ch;         
        }   
    }
    System.out.print(a + " ");
     if (a.length() == word.length()) {
     count++;
   }
  }
    if (count == 0) {
      System.out.println("\nNIL");
 } 
 else {
  System.out.println("\n" + count);
        }
}
}

