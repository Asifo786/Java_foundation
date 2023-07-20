import java.util.Scanner;

public class ArrayReference {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scn.nextInt();

        System.out.println("Enter the elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("----Original Array------");
        ArrayInput.printArray(arr);
        
        System.out.println("----Copied Array------");
        int[] arr_copied = arr;
        ArrayInput.printArray(arr_copied);
        
        System.out.println("----After changes------");
        arr_copied[0]= 4;
        arr_copied[1]= 3;
        System.out.println("----Original Array------");
        ArrayInput.printArray(arr);
        System.out.println("----Copied Array------");
        ArrayInput.printArray(arr_copied);
        

        scn.close();
    }
}
