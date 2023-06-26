import java.util.Scanner;

class Triangle {
    int a, b, c;

    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.pow(s * (s - a) * (s - b) * (s - c), 0.5);
    }

    public double getPerimeter() {
        return a + b + c;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Triangle t = new Triangle();
        t.a=scn.nextInt();
        t.b=scn.nextInt();
        t.c=scn.nextInt();
        System.out.println(t.getArea());
        System.out.println(t.getPerimeter());

        scn.close();
    }
}
