import java.util.Scanner;

class Year {
    public boolean isLeap(int year) {
        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0))
            return true;
        else
            return false;
    }
}

public class Test4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scn.nextInt();

        Year objYear = new Year();
        System.out.println(objYear.isLeap(year));
        scn.close();
    }
}
