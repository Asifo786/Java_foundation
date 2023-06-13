import java.util.Scanner;

public class EncounterSumProgram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("\t\tTo exit input:-1");
        System.out.println("Enter the Numbers:");
        
        int sum = 0;
        while (scn.hasNextInt()) {
            int num = scn.nextInt();
            if (num >= 0) {
                if (sum == -1)
                    continue;
                sum += num;
            }
            if (num == -1) {
                break;
            }
            if (num < 0) {
                sum = -1;
            }

        }

        System.out.println("Sum: " + sum);
    }
}
