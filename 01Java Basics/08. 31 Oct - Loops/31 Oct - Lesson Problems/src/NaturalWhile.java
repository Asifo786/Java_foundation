import java.util.Scanner;

public class NaturalWhile {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number of terms:");
        int term = scn.nextInt();

        int i=1;
        while(i<=term){
            System.out.print(i+" ");
            i++;
        }
    }
}
