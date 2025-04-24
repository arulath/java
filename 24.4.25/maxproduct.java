import java.util.*;
public class maxproduct {
    public static void main(String[] args){
        int max=0;
        int product=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
             product=arr[i]*arr[j]; 
            if(product>max){
                max=product;
            }
        }
        
    }
    System.out.println("The maximum product of the array is: "+max);
}
}

