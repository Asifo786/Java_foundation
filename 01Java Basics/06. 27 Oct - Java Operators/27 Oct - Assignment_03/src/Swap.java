import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking first input
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        
        // taking second input
        System.out.println("Enter y: ");
        int y = sc.nextInt();

        x = x+y;    //x = 15
        y = x-y;    // y = 15 - 10 = 5
        x = x-y;    // x = 15 - 5 = 10
        System.out.println("\t_____After swapping of numbers_____");
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
