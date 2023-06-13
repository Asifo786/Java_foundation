import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking a number from the keyboard
        System.out.println("Enter x: ");
        int x = sc.nextInt();

        int result = ((x+8)/3)%5*5;
        System.out.println("Result: "+result);
    }
}
