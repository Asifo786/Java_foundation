import java.util.Scanner;

public class SkipNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x: ");
        int x = sc.nextInt();

        if(x>0){
            System.out.println("You entered: "+x);
        }else{
            System.out.println("Number skipped..!");
        }
    }    
}
