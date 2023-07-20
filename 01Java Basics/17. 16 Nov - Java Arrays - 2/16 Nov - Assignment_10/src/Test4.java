import java.util.Scanner;

public class Test4 {
  public static void subArray(int[] arr, int s) {
    int n = arr.length;
    int i = 0, j = 0, sum = 0;

    while (j < n) {
      sum += arr[j];

      if (sum > s) {
        while (sum > s && i < j) {
          sum -= arr[i];
          i++;
        }
      }
      
      if (sum == s) {
        System.out.print(i + " ");
        System.out.print(j);
        break;
      }
      j++;
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.print("Enter the size: ");
    int size = scn.nextInt();

    System.out.println("Enter " + size + " non-negative elements of the unsorted arr:");
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }

    System.out.print("Enter s: ");
    int s = scn.nextInt();

    subArray(arr, s);

    scn.close();
  }
}
