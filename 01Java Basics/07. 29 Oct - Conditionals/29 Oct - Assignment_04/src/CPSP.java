import java.util.Scanner;
public class CPSP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking costPrice
        System.out.print("Enter cp: ");
        float cp = sc.nextFloat();
        // taking sellingPrice
        System.out.print("Enter sp: ");
        float sp = sc.nextFloat();

        float amt;
        if(cp>sp){
            amt = cp - sp;
            System.out.println("Profit: "+amt);
        }else if(sp>cp){
            amt = sp - cp;
            System.out.println("Loss: "+amt);
        }else{
            System.out.println("No Profit No Loss");
        }
    }
}
