public class firstDuplicate {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5, 3};
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("First Duplicate: " + arr[i]);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("No Duplicates Found");
        }
    }
}
