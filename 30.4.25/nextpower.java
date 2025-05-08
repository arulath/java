public class nextpower {
    public static void main(String[] args) {
        int num = 20;
        int power = 1;

        while (power < num) {
            power = power * 2;
        }

        System.out.println("Next power of 2 is: " + power);
    }
}
