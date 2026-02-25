class Solution {
    public int numberOfSubarrays(int[] arr, int target) {
       HashMap<Integer,Integer> seen = new HashMap<>();
       int prefixSum =0;
       int count =0;
       int n = arr.length;
        seen.put(0,1);
       for(int i =0;i<n;i++)
       {
           prefixSum+=arr[i];
           if(seen.containsKey(prefixSum-target))
            count+=seen.get(prefixSum-target);
            
          seen.put(prefixSum,seen.getOrDefault(prefixSum,0)+1);
       }
       return count;
    }
}
