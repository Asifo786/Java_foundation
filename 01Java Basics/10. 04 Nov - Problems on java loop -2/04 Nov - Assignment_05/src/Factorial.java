import java.util.Scanner;

// package 01Java Basics.304 Nov - Problems on java loop -2.04 Nov - Assignment_06;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // taking input of a number
        System.out.println("Enter a number:");
        int num = scn.nextInt();

        int fact = 1;
        for(int i=1; i<=num; i++){
            fact*=i;
        }
        System.out.println(num+"! = "+fact);
    }
}
