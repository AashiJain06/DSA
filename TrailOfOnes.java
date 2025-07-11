import java.util.Scanner;

public class TrailOfOnes {
  public static int countConsec(int n) {
    if (n < 2)
      return 0;
    if (n == 2)
      return 1;
    int num1 = 0;
    int num2 = 1;
    int num3;
    int result = 1;
    for (int i = 3; i <= n; i++) {
      num3 = num1 + num2;
      result = result * 2 + num3;
      num1 = num2;
      num2 = num3;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter number");
    n = sc.nextInt();
    int result = countConsec(n);
    System.out.println(result);
  }
}
