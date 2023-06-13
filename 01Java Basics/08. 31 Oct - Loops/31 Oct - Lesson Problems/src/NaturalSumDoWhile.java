import java.util.Scanner;

public class NaturalSumDoWhile {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // taking number of terms from the keyboard
        System.out.println("Enter number of term:");
        int term = scn.nextInt();

        int sum = 0;
        int i=0;
        do{
            sum+=i;
            i++;
        }while(i<=term);
        System.out.println("Sum: "+sum);
    }
}
