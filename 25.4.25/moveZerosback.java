import java.util.*;
public class moveZerosback{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size");
    int n=sc.nextInt();
    System.out.println("Enter elements");
    int[] a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int j=0;
    for(int i=0;i<n;i++){
        if(a[i]!=0){
            a[j]=a[i];
            j++;
        }
    }
        while(j<n){
          a[j]=0;
          j++;
        }
        for (int num : a) {
            System.out.print(num + " ");
    }
}
}