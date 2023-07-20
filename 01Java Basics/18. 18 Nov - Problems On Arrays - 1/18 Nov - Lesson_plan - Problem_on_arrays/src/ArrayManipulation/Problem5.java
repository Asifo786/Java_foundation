package ArrayManipulation;

import java.util.Scanner;

public class Problem5 {
    public static int firstReaptingEle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();

        System.out.println("Enter " + size + " elements of the array:");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("first value that repeating in the array: " + firstReaptingEle(arr));

        scn.close();
    }
}
