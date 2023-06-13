import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num: ");
        int num = sc.nextInt();
        int count = 0;
        for (; num != 0;) {
            num /= 10;
            count++;
        }
        System.out.println("Number of digits in given num: " + count);
    }
}
