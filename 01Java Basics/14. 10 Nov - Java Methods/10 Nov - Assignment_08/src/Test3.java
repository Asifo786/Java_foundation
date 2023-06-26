import java.util.Scanner;

class StringClass {
    public String getMiddleCharOfStr(String s) {
        if (s.length() % 2 == 1) { // 6%2==0 coding
            return s.substring(s.length() / 2, s.length() / 2 + 1);
        } else {
            return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }
    }
}

public class Test3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter a String: ");
        String str = scn.nextLine();

        StringClass midStringClass = new StringClass();
        System.out.println("Mid-string of your " + str + " is: "+ midStringClass.getMiddleCharOfStr(str));

        scn.close();
    }
}
