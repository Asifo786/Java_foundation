import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt(); // 5:0101    00000101
        int b = scn.nextInt(); // 2:0010    00000010

        System.out.print((a | b )+ " ");    // 0111
        System.out.print((a & b) + " ");    // 0000
        System.out.println((a ^ b)+" ");    // 0111

        System.out.print((a >> 1)+" ");     // 10000010
        System.out.println((a << 2)+" ");   // 00010100

        System.out.print((b >> 1)+" ");     // 00000001
        System.out.print((b << 2)+" ");     // 00001000
    }
}
