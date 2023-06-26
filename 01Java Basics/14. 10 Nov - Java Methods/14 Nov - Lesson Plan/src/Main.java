class Constructor {
    // It's a default constructor
    // Constructor(){
    // System.out.println("Constructor of constructor called ");
    // }

    int a, b;

    // It's a parametric constructor
    Constructor(int a, int b) {
        System.out.println("Constructor of constructor called ");
    }

    int add() {
        return a + b;
    }

    int sub() {
        return a - b;
    }

    int mul() {
        return a * b;
    }

}

public class Main {
    public static void main(String[] args) {
        Constructor obj = new Constructor(5,5);
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
    }
}
