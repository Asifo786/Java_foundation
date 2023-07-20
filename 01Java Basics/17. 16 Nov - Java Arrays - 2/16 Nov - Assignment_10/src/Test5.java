// import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
    static boolean isEqual(int[] arr1, int[] arr2) {
        boolean flag = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                flag = false;
                break;
            }
        }
        
        return flag;
        // using built in 'equals' fuction in Arrays
        // return Arrays.equals(arr1, 0, arr1.length, arr2, 0, arr2.length);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the size arrays: ");
        int size = scn.nextInt();

        System.out.println("Enter " + size + " elements of the arr1:");
        int[] arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        System.out.println("Enter " + size + " elements of the arr2:");
        int[] arr2 = new int[size];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        System.out.println("Is both the arrays equal?: " + isEqual(arr1, arr2));
        scn.close();
    }
}
