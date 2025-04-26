import java.util.*;
public class ArraySort{
    public static void main(String[] args) {
       String str="bAwutndekWEdkd";
       StringBuilder upperCase=new StringBuilder();
       StringBuilder lowerCase=new StringBuilder();
       for(char c:str.toCharArray()){
        if(Character.isUpperCase(c)){
            upperCase.append(c);
        }
        else{
            lowerCase.append(c);
        }
       }
       char[] upper=upperCase.toString().toCharArray();
       char[] lower=lowerCase.toString().toCharArray();
       Arrays.sort(upper);
       Arrays.sort(lower);
       StringBuilder result=new StringBuilder();
       int i=0,j=0;
       boolean turnUpper=true;
       while(i<upper.length && j<lower.length){
         if(turnUpper){
            result.append(upper[i++]);
         }
         else{
            result.append(lower[j++]);
         }
         turnUpper=!turnUpper;
       }
       while(i<upper.length){
        result.append(upper[i++]);
       }
       while(j<lower.length){
       result.append(lower[j++]);
       }
       System.out.println("\nOutput: "+result);
    }

}
 