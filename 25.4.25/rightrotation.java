import java.util.*;
public class rightrotation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int[] a=new int[s.length];
        for(int i=0;i<s.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        System.out.println("Enter no of rotation");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int last=a[a.length-1];
            for(int j=a.length-1;j>0;j--){
                a[j]=a[j-1];
            }
            a[0]=last;
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

}