class Solution {
    public  String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int n = s.length();
        int i = 0;
        int j = n - 1;
        String vowels = "aeiouAEIOU";
        while (i < j) {
            while (i < j && vowels.indexOf(s.charAt(i))==-1)
                i++;
            while (i<j &&vowels.indexOf(s.charAt(j))==-1)
                j--;
       
            char temp = chars[i];
             chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        String ans = new String(chars);
        return ans;
    }

    
}
