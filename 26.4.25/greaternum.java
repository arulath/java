public class greaternum{
    public static void main(String[] args){
        int arr[]={7,5,1,4,3,2};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.print(" "+arr[i]);
            }
        }
    }
}
