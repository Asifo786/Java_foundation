import java.util.Scanner;

class Area {
    int length;
    int breadth;

    public int getArea() {
        return length * breadth;
    }
}

public class Test3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Area rectangle = new Area();
        System.out.println("Enter length: ");
        rectangle.length = scn.nextInt();
        System.out.println("Enter breadth: ");
        rectangle.breadth = scn.nextInt();
        System.out.println("Area: " + rectangle.getArea());

        scn.close();
    }
}
