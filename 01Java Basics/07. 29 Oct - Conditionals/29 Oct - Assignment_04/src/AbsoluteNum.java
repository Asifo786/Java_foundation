import java.util.Scanner;

public class AbsoluteNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println(x * -1);
        } else {
            System.out.println(x);
        }
    }
}
