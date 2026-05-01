class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        } 
        for(Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            if(hs.contains(entry.getValue()))
             return false;
            hs.add(entry.getValue());
        }
        return true;
    }
}
