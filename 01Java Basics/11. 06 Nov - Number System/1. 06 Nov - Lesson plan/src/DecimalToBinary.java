import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // taking a decimal number
        System.out.println("Enter a decimal number: ");
        int decimal = scn.nextInt();

        int binary = 0;
        int pw = 1; // power of 10
        int orignalDec = decimal;
        while (decimal != 0) { // 5 2
            int parity = decimal % 2;   // 1 0
            binary+=(parity*pw);        // 1 0+1=1
            pw*=10;     //10
            decimal/=2;    //2
        }
        System.out.println("Binar Equiavalent to "+orignalDec+" : "+binary);
    }
}
