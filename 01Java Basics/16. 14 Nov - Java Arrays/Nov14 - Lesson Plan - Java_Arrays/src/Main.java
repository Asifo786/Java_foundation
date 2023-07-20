import java.util.Scanner;

class ArrayExample {
    void demoArray() {
        float[] weights = new float[5];
        weights[0] = 20.5f;
        weights[1] = 44.5f;
        weights[2] = 34.5f;
        weights[3] = 60.5f;
        weights[4] = 56.0f;
        for (float weigth : weights) {
            System.out.println(weigth);
        }

    }

    int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    int searchInArray(int[] arr, int x) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayExample obj = new ArrayExample();
        // obj.demoArray();

        int[] arrInput = new int[3];
        for (int i = 0; i < arrInput.length; i++) {
            arrInput[i] = scn.nextInt();
        }

        System.out.println(obj.sum(arrInput));
        System.out.println(obj.max(arrInput));

        int x = scn.nextInt();
        System.out.println(obj.searchInArray(arrInput, x));

        scn.close();
    }

}
