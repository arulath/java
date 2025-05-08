public class sameStringinSentence {
    public static void main(String[] args) {
        String text = "hellohell";
        String pattern = "hell";
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            String sub = text.substring(i, i + m);
            if (sub.equals(pattern)) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }
}
