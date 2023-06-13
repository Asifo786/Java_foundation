import java.util.Scanner;

public class MultiplyOfTwoNumInDifferentBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // taking decimal number
        System.out.println("Enter a decimal number:");
        int decimal_num1 = scn.nextInt();

        // taking a binary number
        System.out.println("Enter a binary number:");
        int binary_num = scn.nextInt();

        int decimal_num2 = 0;
        int pw = 1; //power of 2
        while(binary_num!=0){
            int unit_digit = binary_num%10;
            decimal_num2+=unit_digit*pw;
            pw*=2;
            binary_num/=10;
        }
        System.out.println(decimal_num1*decimal_num2);
    }
}
