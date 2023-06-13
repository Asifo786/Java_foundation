import java.util.Scanner;
public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // taking number of terms from the keyboard
        System.out.println("Enter number of terms:");
        int term = scn.nextInt();

        for (int i = 1; i <= term; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
