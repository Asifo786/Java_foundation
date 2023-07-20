package ArrayManipulation;

import java.util.Scanner;

public class Problem7 {
    public static int findSmallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findSecondSmallest(int[] arr) {
        int secondMin = findSmallest(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == secondMin) {
                arr[i] = Integer.MAX_VALUE;
            }
        }
        secondMin = findSmallest(arr);
        return secondMin;
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

        System.out.println("Second smallest in the array is: " + findSecondSmallest(arr));
        scn.close();
    }
}
