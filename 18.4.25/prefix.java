public class prefix {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        String prefix = words[0];

        for (int i = 1; i < words.length; i++) {
            while (words[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) break;
            }
        }

        System.out.println("Longest Common Prefix: " + prefix);
    }
} 
