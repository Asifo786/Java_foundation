import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        // condition (i)
        System.out.println(a<50 && a<b);
        // condition (ii)
        System.out.println(a<50 || a<b);
    }
}
