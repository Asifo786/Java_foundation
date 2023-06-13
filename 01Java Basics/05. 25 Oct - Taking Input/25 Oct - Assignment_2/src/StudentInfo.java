import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        // take name of the student
        System.out.println("Enter Your Name: ");
        String name = info.nextLine();

        // take rollNumber of the student
        System.out.println("Enter Your Roll number: ");
        int rollNumber = info.nextInt();

        // take field of interest of the student
        System.out.println("Enter Your field of interest: ");
        String field = info.next();

        // print the output
        System.out.println("\nName: " + name);
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Field of interest: " + field);

    }
}
