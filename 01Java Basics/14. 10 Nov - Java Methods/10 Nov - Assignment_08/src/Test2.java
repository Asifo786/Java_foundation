import java.util.Scanner;
class Counter{
    public int vowelCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    
}
public class Test2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a word in lowercase: ");
        String word = scn.nextLine();
        Counter count = new Counter();
        System.out.println(count.vowelCount(word));
        
        scn.close();
    }

}
