import java.util.ArrayList;
import java.util.List;

public class PascalTriangle1 {
  public static List<Integer> generateRow(int n) {
    long ans = 1;
    List<Integer> list = new ArrayList<>();
    list.add(1);
    for (int i = 1; i < n; i++) {
      ans = ans * (n - i);
      ans = ans / i;
      list.add((int) ans);
    }
    return list;
  }

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> ansList = new ArrayList<>();
    for (int i = 1; i <= numRows; i++) {
      ansList.add(generateRow(i));
    }
    return ansList;
  }

}
