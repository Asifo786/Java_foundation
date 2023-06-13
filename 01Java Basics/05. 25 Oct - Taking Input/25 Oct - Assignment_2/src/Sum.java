import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to calculate their sum:");

        // take first input from the user
        System.out.println("Enter 1st num: ");
        int num1 = sc.nextInt();

        // take second input from the user
        System.out.println("Enter 2nd num: ");
        int num2 = sc.nextInt();

        // result is here
        int sum = num1 + num2;
        System.out.println("Their sum is:\n" + sum);
    }
}