public class Test5 {
    // Peak element is the one which is greater than its immediate left neighbor and
    // its immediate right neighbor
    public static int firstPeak(int[] arr) {
        int peak = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                peak = arr[i];
                break;
            }
        }
        return peak;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 4, 2, 3, 5, 7, 0 };
        System.out.println(firstPeak(arr));
    }
}
