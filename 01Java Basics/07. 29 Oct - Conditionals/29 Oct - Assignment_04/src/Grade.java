import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Marks: ");
        int marks = sc.nextInt();

        if (marks > 90 && marks <= 100) {
            System.out.println("Your Grade is A+");

        } else if (marks > 80 && marks <= 90) {
            System.out.println("Your Grade is A");

        } else if (marks > 70 && marks <= 80) {
            System.out.println("Your Grade is B+");

        } else if (marks > 60 && marks <= 70) {
            System.out.println("Your Grade is B");

        } else if (marks > 50 && marks <= 60) {
            System.out.println("Your Grade is C");

        } else if (marks > 40 && marks <= 50) {
            System.out.println("Your Grade is D");

        } else if (marks > 30 && marks <= 40) {
            System.out.println("Your Grade is E");

        } else {
            System.out.println("Your Grade is F");
        }
        sc.close();
    }
}
