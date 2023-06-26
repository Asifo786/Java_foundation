import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking first operand
        System.out.print("Enter x: ");
        int x = sc.nextInt();

        // taking operator
        System.out.println("Enter an operator ['+', '-', '*', '/']:");
        char oper = sc.next().charAt(0);

        // taking second operand
        System.out.print("Enter y: ");
        int y = sc.nextInt();

        switch(oper){
            case '+':
                System.out.println("Result:"+x+" "+oper+" "+y+" = "+(x+y));
                break;
            case '-':
                System.out.println("Result:"+x+" "+oper+" "+y+" = "+(x-y));
                break;
            case '*':
                System.out.println("Result:"+x+" "+oper+" "+y+" = "+(x*y));
                break;
            case '/':
                System.out.println("Result:"+x+" "+oper+" "+y+" = "+(x/y));
                break;
            default:
                System.out.println("Invalid input..!");
                break;
        }
        sc.close();
    }   
}
