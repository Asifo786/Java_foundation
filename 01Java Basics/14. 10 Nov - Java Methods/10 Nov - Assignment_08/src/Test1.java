import java.util.Scanner;

class Average {
    int x, y, z;
    public double getAverage(int x, int y, int z){
        return (x+y+z)/3;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scn.nextInt();
        System.out.println("Enter second number: ");
        int b = scn.nextInt();
        System.out.println("Enter third number: ");
        int c = scn.nextInt();
        Average obj1 = new Average();
        System.out.println("Average of three number: "+obj1.getAverage(a, b, c));

        scn.close();
    }
}