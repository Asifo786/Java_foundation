import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x: ");
        int x = sc.nextInt();

        System.out.println("Enter y: ");
        int y = sc.nextInt();

        int xor = x^y;
        int numOfBits = 0;
        while(xor!=0){
            xor = xor & (xor - 1);
            numOfBits++;
        }
        System.out.println("Output: "+numOfBits);
    }
}
