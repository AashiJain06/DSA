import java.util.Scanner;

public class AdditionOfBinaryString {

  public static String trimLeadingZero(String s) {
    int first = s.indexOf('1');
    return (first == -1) ? "0" : s.substring(first);
  }

  public static String addBinary(String s1, String s2) {
    s1 = trimLeadingZero(s1);
    s2 = trimLeadingZero(s2);
    int n1 = s1.length() - 1;
    int n2 = s2.length() - 1;
    int base = 2;
    StringBuilder res = new StringBuilder();
    int c = 0;
    while (n1 >= 0 || n2 >= 0) {
      int t1 = 0, t2 = 0, sum = 0;
      if (n1 >= 0) {
        t1 = s1.charAt(n1--) - '0';
      }
      if (n2 >= 0) {
        t2 = s2.charAt(n2--) - '0';
      }
      sum = t1 + t2 + c;
      if (sum >= base) {
        c = 1;
        sum = sum - base;
      } else {
        c = 0;
      }
      res.append(sum);
    }
    if (c == 1) {
      res.append('1');
    }

    return res.reverse().toString();

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1, s2;
    System.out.println("enter strings");
    s1 = sc.next();
    s2 = sc.next();
    String s3 = addBinary(s1, s2);
    System.out.println(s3);
  }
}