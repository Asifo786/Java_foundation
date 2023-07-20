import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scn.nextInt();

        System.out.println("Enter " + size + " elements of the array:");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("Enter K [k<" + size + "]: ");
        int k = scn.nextInt();
        
        Arrays.sort(arr);
        System.out.println("The " + k + "th smallest element of the array: " + arr[k - 1]);
        scn.close();
    }
}
