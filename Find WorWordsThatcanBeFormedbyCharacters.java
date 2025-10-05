class Solution {
    public int countCharacters(String[] words, String chars) {
       int[] charsCount = new int[29];
       Arrays.fill(charsCount,0);
       for(char ch : chars.toCharArray())
       {
         charsCount[ch-'a']++;
       } 
       int result =0;
       for(String word : words)
       {
          int[] wordCount = new int[26];
          Arrays.fill(wordCount,0);
          for(char val : word.toCharArray())
          {
             wordCount[val-'a']++;
          }
          boolean ok = true;
          for(int i =0;i<26;i++)
          {
             if(wordCount[i]>charsCount[i])
             {
              ok = false;
              break;
             }

          }
          if(ok==true)
           result+=word.length();
       }
       return result;
    }
}
