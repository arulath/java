public class stringToInt {
    public static void main(String[] args) {
        String str = "1234";

        try {
            int num = Integer.parseInt(str);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Not a valid integer!");
        }
    }
}
