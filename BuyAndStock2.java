import java.util.Scanner;

public class BuyAndStock2 {
  public static int maxProfit(int[] prices) {
    int n = prices.length;
    int profit = 0;
    for (int i = 1; i < n; i++) {
      if (prices[i] > prices[i - 1])
        profit += prices[i] - prices[i - 1];
    }
    return profit;
  }

  public static void main(String[] args) {
    int[] arr = new int[5];
    int profit;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    profit = maxProfit(arr);
    System.out.println("profit:" + profit);

  }

}
