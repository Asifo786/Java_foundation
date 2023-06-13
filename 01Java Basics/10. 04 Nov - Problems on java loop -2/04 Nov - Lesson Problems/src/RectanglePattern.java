import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter columns: ");
        int cols = sc.nextInt();

        Outer: for (int i = 0; i < rows; i++) {
            Inner: for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}