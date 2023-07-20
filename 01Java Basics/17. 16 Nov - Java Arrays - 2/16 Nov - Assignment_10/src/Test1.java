import java.util.Scanner;

public class Test1 {
    static int[] plusMinus(int[] arr) {
        int[] plusMinus = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                plusMinus[idx] = arr[i];
                idx++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                plusMinus[idx] = arr[i];
                idx++;
            }
        }
        return plusMinus;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scn.nextInt();

        System.out.println("Enter element of the Array:");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        
        int[] result = plusMinus(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        scn.close();
    }
}
