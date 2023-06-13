import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        System.out.println("Enter number of terms:");
        int term = sc.nextInt();

        int sum = 0;
        for(int i=1; i<=term; i++){
            sum+=i;
        }
        System.out.println("Sum: "+sum);
    }
}
