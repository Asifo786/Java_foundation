import java.util.Scanner;

public class HollowNaturalRectanglePattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking number of rows
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        // taking number of columns
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                if(i==1||i==rows||j==1||j==cols)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}