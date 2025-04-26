import java.util.*;
public class countingOfOccurence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]==-1){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]=-1;
                }
            }
            System.out.println(a[i]+" occurs"+count);
        }
    }
}
