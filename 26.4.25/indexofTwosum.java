public class indexofTwosum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int sum=0;
        int target=9;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
           sum=arr[i]+arr[j];
           if(sum==target){
            System.out.print("["+i+","+j+"]");
           }
        }
    }
 }
}