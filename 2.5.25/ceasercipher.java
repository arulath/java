public class ceasercipher{
    public static void main(String[] args) {
        String text = "hello";
        int shift = 3;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (((ch - 'a' + shift) % 26) + 'a'));
            } else {
                result.append(ch);
            }
        }

        System.out.println("Encrypted text: " + result.toString());
    }
}
