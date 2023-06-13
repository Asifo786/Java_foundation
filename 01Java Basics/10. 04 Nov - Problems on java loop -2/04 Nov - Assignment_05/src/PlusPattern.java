import java.util.Scanner;

public class PlusPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // taking number of rows
        System.out.println("Enter rows: ");
        int rows = scn.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                Boolean horzontal = i == rows / 2;
                Boolean vertical = j == rows / 2;
                if (horzontal || vertical) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
