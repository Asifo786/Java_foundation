import java.util.Scanner;

class Comparison {
    int a, b, c;

    public int whichGreater(int x, int y, int z) {
        if (x > y && x > z)
            return x;
        else if (y > x && y > z)
            return y;
        else
            return z;
    }
}

public class Test5 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        Comparison objComparison = new Comparison();


        System.out.println("\t\t~~~Enter three number~~~");
        System.out.println("Enter first number: ");
        objComparison.a = scn.nextInt();
        System.out.println("Enter second number: ");
        objComparison.b = scn.nextInt();
        System.out.println("Enter third number: ");
        objComparison.c = scn.nextInt();
        System.out.println("Greatest among is: "+ objComparison.whichGreater(objComparison.a, objComparison.b, objComparison.c));
        
        scn.close();
    }
}
