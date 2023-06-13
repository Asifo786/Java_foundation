import java.util.Scanner;

public class ThreeDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking three digit number from the user
        System.out.println("Enter three digit num: ");
        int threeDigitNum = sc.nextInt();

        int unitDigit = threeDigitNum % 10;
        threeDigitNum /= 10;

        int tenthDigit = threeDigitNum % 10;
        threeDigitNum /= 10;

        int hundDigit = threeDigitNum % 10;
        threeDigitNum /= 10;

        System.out.println(unitDigit+tenthDigit+hundDigit);
    }
}
