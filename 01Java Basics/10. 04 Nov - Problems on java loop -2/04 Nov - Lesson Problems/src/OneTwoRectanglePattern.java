import java.util.Scanner;

public class OneTwoRectanglePattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking number of rows
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        // taking number of columns
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if((i+j)%2==0)
                    System.out.print("1");
                else
                    System.out.print("2");
            }
            System.out.println();
        }
    }
}