import java.util.Scanner;

class Array {

    void getPositiveEle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0)
                System.out.println(arr[i]);
        }
    }

}

public class Test1 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        Array objArray = new Array();

        System.out.println("Enter size the Array:");
        int size = scn.nextInt();
        int array[] = new int[size];
        System.out.println("Enter element of the Array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        objArray.getPositiveEle(array);

        scn.close();
    }
}
