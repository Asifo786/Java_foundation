import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // taking a binary number
        System.out.println("Enter a binary number:");
        int binary_num = scn.nextInt();

        int orignal_binary = binary_num;
        int decimal_num = 0;
        int pw = 1; // power of 2
        while (binary_num != 0) {
            int unit_digit = binary_num % 10;
            decimal_num += unit_digit * pw;
            pw*=2;
            binary_num/=10;
        }
        System.out.println("Binary Equiavalent to "+orignal_binary+" : "+decimal_num);
    }
}
