class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        int count =0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0;i<a.length;i++)
        {
            hs.add(a[i]);
        }
       for(int i : b)
       {
           if(hs.contains(i))
            count++;
       }
       return count;
    }
}
