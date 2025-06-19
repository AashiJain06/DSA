import java.util.Scanner;

public class BuyAndStock {
  public static int maxProfit(int[] prices) {
    int n = prices.length;
    int min = prices[0];
    int profit = 0;
    for (int i = 0; i < n; i++) {
      min = Math.min(min, prices[i]);
      profit = Math.max(profit, prices[i] - min);
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
