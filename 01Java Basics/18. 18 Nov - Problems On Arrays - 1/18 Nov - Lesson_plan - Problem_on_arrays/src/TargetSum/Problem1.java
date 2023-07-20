package TargetSum;

import java.util.Scanner;

public class Problem1 {
    public static int pairSum(int[] arr, int target) { // arr = 4 7 3 21 6 5 5, target = 10
        int count = 0;
        for (int i = 0; i < arr.length; i++) {  //firstNum
            for (int j = i + 1; j < arr.length; j++) {  //secondNum
                if (arr[i] + arr[j] == target)
                    count++;
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

        System.out.println("Number of pair sum in the array is equivalent to target: " + pairSum(arr, target));

        scn.close();
    }
}
