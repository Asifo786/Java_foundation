import java.util.Scanner;

public class EquilateralTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking number of rows
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        Pyramid: for (int i = 1; i <= rows; i++) {
            int numOfSpace = rows - i;
            Spaces: for (int j = 0; j < numOfSpace; j++) {
                System.out.print(" ");
            }

            int numOfStras = 2 * i - 1;
            Stars: for (int k = 0; k < numOfStras; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}