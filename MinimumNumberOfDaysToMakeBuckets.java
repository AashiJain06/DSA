public class MinimumNumberOfDaysToMakeBuckets {
  //

  public int minDays(int[] bloomDay, int m, int k) {
    int n = bloomDay.length;
    long val = (long) m * k;
    if (val > n)
      return -1;
    int mini = Integer.MAX_VALUE;
    int maxi = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      mini = Math.min(mini, bloomDay[i]);
      maxi = Math.max(maxi, bloomDay[i]);
    }
    int low = mini;
    int high = maxi;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (isPossible(bloomDay, m, k, mid))
        high = mid - 1;
      else
        low = mid + 1;
    }
    return low;
  }

  public static boolean isPossible(int[] bloomDay, int m, int k, int mid) {
    int count = 0;
    int buckets = 0;
    for (int i = 0; i < bloomDay.length; i++) {
      if (bloomDay[i] <= mid)
        count++;
      else {
        buckets += (count / k);
        count = 0;
      }
    }
    buckets += (count / k);
    return buckets >= m;
  }
}
