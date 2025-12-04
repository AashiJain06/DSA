class Solution {
    public int countCollisions(String direction) {
        final int n = direction.length();
        if(n==1)
         return 0;
        int i =0;
        int j = n-1;
        while(i<j && direction.charAt(i)=='L')
         i++;
        while(i<j && direction.charAt(j)=='R')
         j--;
         if(i>=j)
          return 0;
        int col =0;
        for(;i<=j;i++)
        {
            if(direction.charAt(i)!='S')
             col++;
        }
        return col;

    }
}
