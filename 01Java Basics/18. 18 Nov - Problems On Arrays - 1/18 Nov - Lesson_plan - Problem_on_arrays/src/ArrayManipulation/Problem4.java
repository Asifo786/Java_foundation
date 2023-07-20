package ArrayManipulation;

import java.util.Scanner;

public class Problem4 {
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int findSecondMax(int[] arr) {
        int secondMax = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (secondMax == arr[i]) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        secondMax = findMax(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scn.nextInt();

        System.out.println("Enter " + size + " elements of the array: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Second max in the array is: " + findSecondMax(arr));
        scn.close();
    }
}
