import java.util.*;
public class removeSpecialChar {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                s.append(ch);
            }
        }
        System.out.println("After removing special character: "+s);
    }
}
