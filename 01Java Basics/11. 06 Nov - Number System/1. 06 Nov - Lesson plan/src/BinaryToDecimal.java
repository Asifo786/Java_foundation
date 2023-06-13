import java.util.Scanner;

class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // taking binary number from the user
        System.out.println("Enter a binary number:");
        int bin = scn.nextInt();

        int decimal = 0, orignalBin = bin;
        int powOfTwo = 1;   // power of 2
        while (bin != 0) { // bin = 101 10 1
            int digit = bin % 10; // 1 0 1
            decimal += digit * powOfTwo; // 1*2^0: =1 0*2=0:=1 1*2^2=4+1=5
            bin /= 10; // 10 1 0
            powOfTwo *= 2; // 2*2=4 8
        }
        System.out.println("Decimal equiavalent of " + orignalBin + " : " + decimal);
    }
}