import java.util.*;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
    if(str.indexOf(ch)==str.lastIndexOf(ch)){
        System.out.println("First Non repeated character: "+ch);
        return;
    }
    else{
        System.out.println("Nil");
    }
}
    }
}