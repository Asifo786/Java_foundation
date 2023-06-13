import java.util.Scanner;

public class NumRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking number of rows
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        Outter: for (int i = 1; i <= rows; i++) {
            Inner1: for (int j = i; j <= rows; j++) {
                System.out.print(j + " ");
            }
            Inner2: for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}