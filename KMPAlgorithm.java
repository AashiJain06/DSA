package String;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KMPAlgorithm {
  public static void computeLps(String pat, int m, int[] lps) {
    int len = 0;
    int i = 1;
    lps[0] = 0;
    while (i < pat.length()) {
      if (pat.charAt(i) == pat.charAt(len)) {
        len++;
        lps[i] = len;
        i++;

      } else {
        if (len != 0)
          len = lps[len - 1];
        else {
          lps[i] = 0;
          i++;
        }
      }
    }
  }

  public static ArrayList<Integer> search(String pat, String txt) {
    // your code here
    ArrayList<Integer> res = new ArrayList<>();
    int n = txt.length();
    int m = pat.length();
    int[] lps = new int[m];
    computeLps(pat, m, lps);
    int j = 0;
    int i = 0;

    while (i < n) {
      if (txt.charAt(i) == pat.charAt(j)) {
        i++;
        j++;

        if (j == m) {
          res.add(i - j);
          j = lps[j - 1];
        }
      } else {
        if (j != 0) {
          j = lps[j - 1];
        } else
          i++;
      }
    }

    return res;
  }

  public static void main(String[] args) {
    String s = "";
    String sub = "";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter text string");
    s = sc.next();
    System.out.println("Enter string to be search");
    sub = sc.next();
    List<Integer> al = new ArrayList<>();
    al = search(s, sub);
    System.out.println(al);

  }
}