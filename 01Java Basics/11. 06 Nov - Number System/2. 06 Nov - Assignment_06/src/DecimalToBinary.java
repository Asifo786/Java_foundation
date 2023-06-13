import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        // taking a decimal number
        System.out.println("Enter a decimal number:");
        int decimal = scn.nextInt();

        int binary = 0; // It will store desired value
        int pw = 1; // power of 10
        int orignalDec = decimal;
        while (decimal != 0) {
            int parity = decimal%2;
            binary += (parity*pw);
            pw*=10;
            decimal/=2;
        }
        System.out.println("Decimal Equiavalent to "+orignalDec+" : "+binary );
    }
}
