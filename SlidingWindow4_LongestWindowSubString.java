class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        if (t.length() > n)
            return "";
        int j = 0;
        int i = 0;
        int min_window = Integer.MAX_VALUE;
        int count = t.length();
        int start = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int k = 0; k < t.length(); k++) {
            freq.put(t.charAt(k), freq.getOrDefault(t.charAt(k), 0) + 1);
        }
        while (j < n) {
            if (freq.containsKey(s.charAt(j)) && freq.get(s.charAt(j)) > 0)
                count--;

            freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) - 1);

            while (count == 0) {
                if ((j - i + 1) < min_window) {
                    min_window = j - i + 1;
                    start = i;
                }
                freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);

                if (freq.containsKey(s.charAt(i)) && freq.get(s.charAt(i)) > 0)
                    count++;

                 i++;
            }
            j++;
        }
        return min_window == Integer.MAX_VALUE ? "" : s.substring(start, start + min_window);
    }
}
