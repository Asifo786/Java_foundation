import java.util.Scanner;

public class NaturalNumRectanglePattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking number of rows
        System.out.println("Enter number of rwos:");
        int rows = sc.nextInt();

        // taking number of columns
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}