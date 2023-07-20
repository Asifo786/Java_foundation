import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] removeDuplicateEle(int[] arr) {
        int uniqueCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[uniqueCount++] = arr[i];
            }
        }
        arr[uniqueCount] = arr[arr.length - 1]; // copy last element

        // resize the array to remove extra elements
        arr = Arrays.copyOf(arr, uniqueCount+1);
        return arr;
    }

    static int[] union(int[] arr1, int[] arr2) {
        int[] merge = new int[arr1.length + arr2.length];

        merge = Arrays.copyOf(arr1, arr1.length + arr2.length);
        int idx = 0;
        for (int i = arr1.length; i < (arr1.length + arr2.length); i++) {
            merge[i] = arr2[idx];
            idx++;
        }

        Arrays.sort(merge);
        merge = removeDuplicateEle(merge);

        return merge;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // ------------------first array--------------
        System.out.print("Enter the size of arr1: ");
        int size1 = scn.nextInt();

        System.out.println("Enter " + size1 + " elements of arr1:");
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        // ------------------second array--------------
        System.out.print("Enter the size of arr2: ");
        int size2 = scn.nextInt();

        System.out.println("Enter " + size2 + " elements of arr2: ");
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        // ------------------output--------------
        System.out.print("Union: ");
        int[] unionSet = union(arr1, arr2);
        printArray(unionSet);
        System.out.println("\nUnion Length: " + unionSet.length);

        scn.close();
    }
}
