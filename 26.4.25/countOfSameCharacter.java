import java.util.*;
public class countOfSameCharacter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        int count=1;
        for(int i=0;i<str.length();i++){
            if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
            count++;
        }
        else{
            System.out.print(str.charAt(i)+""+count);
            count=1;
        }
    }
    }
}
