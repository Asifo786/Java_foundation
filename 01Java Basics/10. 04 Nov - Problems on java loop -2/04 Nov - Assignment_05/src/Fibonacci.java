import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // taking number of the terms
        System.out.println("Enter number of terms:");
        int terms = sc.nextInt();

        // printing the fibonacci series
        int a = 1, b = 1;
        for(int i=1; i<=terms; i++){
            System.out.print(a+" ");            
            int sum = b + a;
            a = b;
            b = sum;

        }
    }
}
