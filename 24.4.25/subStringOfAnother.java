import java.util.*;
public class subStringOfAnother {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(str1.contains(str2)){
           System.out.println("yes "+str1+" has "+str2);
        }
        else{
            System.out.println("No "+str2+" was not in "+str1);
        }
    }
}
