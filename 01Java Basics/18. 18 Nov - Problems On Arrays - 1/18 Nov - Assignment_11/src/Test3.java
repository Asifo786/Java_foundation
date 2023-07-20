import java.util.Scanner;

public class Test3 {
    public static int missing(int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length + 1; i++) {
            sum += i;
        }

        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        return sum - arrSum;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scn.nextInt();

        System.out.println("Enter " + size + " elements of the array in the range [1 to " + (size + 1) + "]: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("The missing value in the array of first " + (size + 1) + " interger: " + missing(arr));
        scn.close();
    }
}
