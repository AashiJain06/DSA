class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        long[] prefix = new long[n];
        int sum =0;
        for(int i =0;i<n;i++)
        {
            sum+=arr[i];
            prefix[i] = sum;
        }
        int index = -1;
        for(int i =1;i<n-1;i++)
        {
            if(prefix[i-1]==(prefix[n-1]-prefix[i]))
            {
             index = i;
             break;
            }
        }
        return index;
    }
}
