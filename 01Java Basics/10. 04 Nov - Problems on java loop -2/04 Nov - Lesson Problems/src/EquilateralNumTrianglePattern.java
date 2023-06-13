import java.util.Scanner;

public class EquilateralNumTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking number of rows
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        NumPyramid: for (int i = 1; i <= rows; i++) {
            // printing the spaces left side of the triangle
            int numOfSpace = rows - i;
            Inner1: for (int j = 1; j <= numOfSpace; j++) {
                System.out.print(" ");
            }

            // printing the subsequent numbers in ascending order
            Inner2: for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // printing the subsequent numbers in descending order
            Inner3: for (int m = i - 1; m >= 1; m--) {
                System.out.print(m);
            }

            System.out.println();
        }
    }
}
