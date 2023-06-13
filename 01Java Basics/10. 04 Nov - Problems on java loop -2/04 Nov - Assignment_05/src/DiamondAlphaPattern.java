import java.util.Scanner;

public class DiamondAlphaPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // taking number of rows
        System.out.println("Enter number of rows: ");
        int rows = scn.nextInt();

        // upper part of the triangle
        for (int i = 1; i <= rows; i++) {
            // print the spaces beside the triangle pattern
            int UpperNumOfSpaces = rows - i;
            for (int j = 1; j <= UpperNumOfSpaces; j++) {
                System.out.print(" ");
            }
            // print the upper part of the triangle in the form of alphabate.
            int UpperAlphaChar = 2 * i - 1;
            for (int k = 0; k < UpperAlphaChar; k++) {
                System.out.print((char) ('A' + k));
            }

            System.out.println();
        }


        // lower part of the triangle
        for (int i = rows + 1; i <= 2 * rows; i++) {
            // print the spaces beside the triangel
            int lowerNumOfSpaces = i - rows;
            for (int j = 1; j <= lowerNumOfSpaces; j++) {
                System.out.print(" ");
            }
            // print the lower part of the triangle in the form of alphabates.
            int lowerAlphaChar = 2 * (2 * rows - i) - 1;
            for (int k = 0; k < lowerAlphaChar; k++) {
                System.out.print((char) ('A' + k));
            }
            System.out.println();
        }
    }

}
