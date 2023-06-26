import java.util.Scanner;

class Complex {
    int realPart;
    int imagPart;

    public Complex(int r, int i) {
        realPart = r;
        imagPart = i;
    }

    public static Complex addComplex(Complex a, Complex b) {
        return new Complex((a.realPart + b.realPart), (a.imagPart + b.imagPart));
    }

    public static Complex diffComplex(Complex a, Complex b) {
        return new Complex((a.realPart - b.realPart), (a.imagPart - b.imagPart));
    }

    public static Complex productComplex(Complex a, Complex b) {
        return new Complex(((a.realPart * b.realPart) - (a.imagPart * b.imagPart)),
                ((a.realPart + b.imagPart) - (a.imagPart * b.realPart)));
    }
    public void printComplex(){
        System.out.println(realPart+" + i"+imagPart);
    }
}

public class Test4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // first complex number
        System.out.println("\nEnter real part of first complex number");
        int x1 = scn.nextInt();
        System.out.println("Enter imaginary part of first complex number without iota");
        int y1 = scn.nextInt();

        // second complex number
        System.out.println("Enter real part of second complex number");
        int x2 = scn.nextInt();
        System.out.println("Enter imaginary part of second complex number without iota");
        int y2 = scn.nextInt();

        // Display your response
        System.out.println("Your response:\n1st complex number: " + x1 + " + i" + y1);
        System.out.println("2nd complex number: " + x2 + " + i" + y2);

        Complex c1 = new Complex(x1, y1);
        Complex c2 = new Complex(x2,y2);
        

        scn.close();
    }
}