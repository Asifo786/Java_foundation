package ArrayManipulation;

import java.util.Scanner;

public class Problem3 {
    public static int uniqueEle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = arr[j] = -1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scn.nextInt();

        System.out.println("Enter " + size + " elements of the array[remeber only one unique element]:");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Unique element in the array is: " + uniqueEle(arr));

        scn.close();
    }
}