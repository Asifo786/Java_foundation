import java.util.Scanner;

public class Test2 {
    public static int countOccurrence(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scn.nextInt();

        System.out.println("Enter " + size + " elements of the array: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("Enter x: ");
        int target = scn.nextInt();

        System.out.println("The total number of occurrence of " + target + ": " + countOccurrence(arr, target));

        scn.close();
    }
}
