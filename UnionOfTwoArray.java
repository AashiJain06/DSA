class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0;i<a.length;i++)
        {
            if(!hs.contains(a[i]))
             hs.add(a[i]);
        }
        for(int i =0;i<b.length;i++)
        {
            if(!hs.contains(b[i]))
             hs.add(b[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.addAll(hs);
        return ans;
    }
}
