package ArrayManipulation;

import java.util.Scanner;

public class Problem6 {
    public static int lastReaptingEle(int[] arr) {
        int lastReaptingEle = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    lastReaptingEle = arr[i];
                }
            }
        }
        return lastReaptingEle;
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

        System.out.println("second value that repeating in the array: " + lastReaptingEle(arr));

        scn.close();
    }

}
