import java.util.Scanner;

public class Robert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // marks of first subject
        System.out.println("Enter 1st subject marks: ");    
        float maths = sc.nextFloat();
        
        // marks of second subject
        System.out.println("Enter 2nd subject marks: ");
        float phy = sc.nextFloat();
        
        // marks of third subject
        System.out.println("Enter 3rd subject marks: ");    
        float che = sc.nextFloat();

        float total = maths + phy + che;
        float percentage = total/3;
        System.out.println("Total marks: "+total);
        System.out.println("Percentage marks: "+percentage+"%");
    }
}