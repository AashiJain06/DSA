class Solution {
    public int maxVowels(String s, int k) {
       //By Using Sliding Window Approach
        if(k<0 || k>s.length())
          return -1;
          int n = s.length();
        String vowels = "aeiou";
        int i =0;
        int max_count =0;
        int vowels_count =0;
        for(int j =0;j<n;j++)
        {
            if(vowels.indexOf(s.charAt(j))!=-1)
            {
              vowels_count++;
            }
            if((j-i+1)==k)
            {
                max_count = Math.max(max_count,vowels_count);
            
               if(vowels.indexOf(s.charAt(i))!=-1)
                    vowels_count--;

             i++;
            }
        }
       return max_count;
    }

    
}
