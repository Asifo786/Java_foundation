import java.util.Scanner;

public class Example1234 {
    static int lastOccurrence(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                lastIndex = i;
        }
        return lastIndex;
    }

    static int countOccurrence(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                count++;
        }
        return count;
    }

    static int countOfElements(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x)
                count++;
        }
        return count;
    }

    static boolean isSorted(int[] arr) {
        // '''NOTE: The method will be work if the array is in ascending order'''
        boolean result = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                continue;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scn.nextInt();

        System.out.println("Enter " + size + " element of the array:");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("Enter x: ");
        int x = scn.nextInt();

        System.out.println("Last Occurrence of " + x + " in the array is: " + lastOccurrence(arr, x));

        System.out.println(x + " present in the array: " + countOccurrence(arr, x) + " times");

        System.out.println("Number of Elements strictly greater than " + x + " is: " + countOfElements(arr, x));

        System.out.println("Is the given array sorted?: " + isSorted(arr));

        scn.close();
    }
}