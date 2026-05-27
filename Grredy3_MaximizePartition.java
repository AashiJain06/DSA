class Solution {
    public int maxPartitions(String s) {
        // code here
        HashMap<Character , Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            freq.put(ch , freq.getOrDefault(ch,0)+1);
        }
        HashSet<Character> currentChars = new HashSet<>();
        int partition = 0;
        int active =0;
        for(char ch : s.toCharArray())
        {
            freq.put(ch,freq.getOrDefault(ch,0)-1);
            currentChars.add(ch);
            if(freq.get(ch)==0)
             active++;
            if(active==currentChars.size())
            {
                partition++;
                active =0;
                currentChars.clear();
            }
        }
        return partition;
    }
}
