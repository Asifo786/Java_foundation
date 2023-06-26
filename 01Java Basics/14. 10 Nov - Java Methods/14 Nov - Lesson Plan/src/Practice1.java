import java.util.Scanner;

class Algebra {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }

}

public class Practice1 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        Algebra objAlgebra = new Algebra();

        int x = scn.nextInt();
        int y = scn.nextInt();
        int sum = objAlgebra.add(x, y);
        System.out.println(sum);

        scn.close();
    }

}
