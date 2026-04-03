class Solution {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int low = 1;
        int high = position[n-1] - position[0];
        while(low<=high)
        {
            int mid = (low + high)/2;
            if(canPlaceBalls(position,mid,m)==true)
             low = mid +1;
            else
             high = mid -1;
        }
        return high;
    }
    public boolean canPlaceBalls(int[] arr, int distance,int balls)
    {
        int count =1;
        int last = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]-last>=distance)
            {
                count++;
                last = arr[i];
            }
        }
        return count>=balls;
    }
}
