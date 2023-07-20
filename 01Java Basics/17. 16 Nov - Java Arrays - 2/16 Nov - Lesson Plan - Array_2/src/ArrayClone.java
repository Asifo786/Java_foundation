import java.util.Scanner;
import java.util.Arrays;
public class ArrayClone {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};

        // int[] arr_copied = arr.clone();
        // arr_copied[0]=5;
        // arr_copied[1]=1;

        // ArrayInput.printArray(arr);
        // ArrayInput.printArray(arr_copied);
        
        // System.out.println("----------------");
        // int[] arr_copied = Arrays.copyOf(arr, arr.length);
        // ArrayInput.printArray(arr);
        // ArrayInput.printArray(arr_copied);

        System.out.println("----------------");
        int[] arr_copied = Arrays.copyOfRange(arr, 0,4);
        ArrayInput.printArray(arr);
        ArrayInput.printArray(arr_copied);
    
        scn.close();
    }
}
