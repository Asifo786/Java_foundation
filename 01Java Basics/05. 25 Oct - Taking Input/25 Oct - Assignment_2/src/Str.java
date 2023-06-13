import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking first string
        System.out.println("Enter 1st Str: ");
        String str1 = sc.nextLine();

        // taking second string
        System.out.println("Enter 2nd Str: ");
        String str2 = sc.nextLine();

        System.out.println(str1 + str2);
    }
}
