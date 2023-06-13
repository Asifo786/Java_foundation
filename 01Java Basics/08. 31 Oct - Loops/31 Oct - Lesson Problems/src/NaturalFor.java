import java.util.Scanner;

public class NaturalFor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number of terms:");
        int term = scn.nextInt();

        for(int i=1; i<=term ; i++){
            System.out.print(i+" ");
        }
    }
}
