public class NonRepeatedChar{
    public static void main(String[] args) {
        String str="swiss";
        for(int i=0;i<str.length();i++){
        char c = str.charAt(i);
        if(str.indexOf(c)==str.lastIndexOf(c)){
            System.out.println("The First non repeated character is:" +c);
            return;
         }
         else{
            System.out.println("everything repeated:");
         }
        }
    }
}