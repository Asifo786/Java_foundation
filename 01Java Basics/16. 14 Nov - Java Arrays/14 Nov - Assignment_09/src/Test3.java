public class Test3 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int even : arr) {
            if (even % 2 == 0)
                System.out.println(even);
        }
    }
}
