import java.util.Scanner;

public class Xpattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // taking number of rows
        System.out.println("Enter rows: ");
        int rows = scn.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                boolean primaryDigonal = j == rows - i - 1;
                boolean secondaryDigonal = i == j;
                if (primaryDigonal || secondaryDigonal) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
