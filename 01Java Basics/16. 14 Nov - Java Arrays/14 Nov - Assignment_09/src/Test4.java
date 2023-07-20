public class Test4 {
    static int min(int[] arr) {
        int min = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 2, -3, 5, 8, 1, 0, -4 };
        System.out.print(min(arr));
    }
}
