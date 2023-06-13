import java.util.Scanner;

public class Armstrong {
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);

    //     // taking number of terms
    //     System.out.println("Enter n:");
    //     int n = scn.nextInt();

    //     for (int num = 1; num <= n; num++) {

    //         int count = 0;
    //         int i = num;
    //         while (i > 0) { // It will count the number of digits contain in the number
    //             count++;
    //             i /= 10;
    //         }

    //         int sum = 0;
    //         int val = num;
    //         while (val > 0) {   // It will store sum of cube of each digits of the value in val
    //             int digit = val % 10;
    //             sum += Math.pow(digit, count);
    //             val /= 10;
    //             if (sum > val) {
    //                 continue;
    //             }
    //         }

    //         if(sum == num){     // print the armstrong number
    //             System.out.print(num+" ");
    //         }
    //     }

    // }


    // Another way using function
    static boolean isArmstrong(int x) {
        int sum = 0;
        int n = x;
        while (x != 0) {
            int digit = x % 10;
            sum += Math.pow(digit, 3);
            x /= 10;
        }
        if (sum == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i) == true)
                System.out.println(i);
        }
    }
}
