public class FirstAndLastOccurence {
  public static int firstOccurence(int[] arr, int x) {
    int n = arr.length;
    int first = n;
    int low = 0;
    int high = n - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] >= x) {
        first = mid;
        high = mid - 1;
      } else
        low = mid + 1;
    }
    return first;
  }

  public static int lastOccurence(int[] arr, int x) {
    int n = arr.length;
    int low = 0;
    int high = n - 1;
    int last = n;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] > x) {
        last = mid;
        high = mid - 1;
      } else
        low = mid + 1;

    }
    return last;
  }

  ArrayList<Integer> find(int arr[], int x) {
    ArrayList<Integer> ans = new ArrayList<>();
    int n = arr.length;
    int first = firstOccurence(arr, x);
    int last = -1;
    if (first == n || arr[first] != x) {
      ans.add(-1);
      ans.add(-1);
      return ans;
    } else {
      last = lastOccurence(arr, x);
      last = last - 1;
      ans.add(first);
      ans.add(last);
    }
    return ans;

  }

}
