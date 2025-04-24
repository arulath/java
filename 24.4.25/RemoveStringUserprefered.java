public class RemoveStringUserprefered {
    public static void main(String[] args) {
        String str1="This is a test";
        String str2="is";
        String str3="";
        for(int i=0;i<str1.length();i++){
            char[] ch=str1.toCharArray();
            str3=str1.replace(str2,"");
        }
            System.out.println(str3);
    }

}