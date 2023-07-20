import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static boolean absoluteDiff(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[j] - arr[i]) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scn.nextInt();

        System.out.println("Enter " + size + " elements of the array: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("Enter x: ");
        int target = scn.nextInt();

        Arrays.sort(arr);
        System.out.println("Is a pair in the array whose absolute difference exactly " + target + " : "
                + absoluteDiff(arr, target));

        scn.close();
    }
}
