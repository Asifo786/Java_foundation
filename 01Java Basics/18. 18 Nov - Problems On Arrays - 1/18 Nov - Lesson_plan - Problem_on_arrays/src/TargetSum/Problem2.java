package TargetSum;

import java.util.Scanner;

public class Problem2 {
    public static int tripletSum(int[] arr, int target) { // arr = 4 7 3 21 6 5 5, target = 16
        int count = 0;
        for (int i = 0; i < arr.length; i++) { // firstNum
            for (int j = i + 1; j < arr.length; j++) { // secondNum
                for (int k = j + 1; k < arr.length; k++) { // thirdNum
                    if (arr[i] + arr[j] + arr[k] == target)
                        count++;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scn.nextInt();

        System.out.println("Enter " + size + " elements of the arr: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("Enter your target: ");
        int target = scn.nextInt();

        System.out.println("Number of triplet sum in the array is equivalent to target: " + tripletSum(arr, target));

        scn.close();
    }
}
