class Solution {
    public int nextGreaterElement(int n) {
        if(n>Integer.MAX_VALUE)
         return -1;
    int digit =0;
     long temp =n;
       while(temp>0)
       {
         digit++;
         temp= temp/10;
       }
      int[] digits = new int[digit];
      temp =n;
      for(int  k=digit-1;k>=0;k--)
      {
        digits[k] = (int)temp%10;
        temp = temp/10;
      }
      int i =digit-1;
      while(i>0 && digits[i]<=digits[i-1])
       i--;
      if(i==0)
       return -1;
      int j =digit-1;
      while(j>=i && digits[j]<=digits[i-1])
       j--;
      swap(i-1,j,digits);
      reverse(i,digit-1,digits);
      int rem =0;
      temp =digits[0];
      for(int k =1;k<digit;k++)
      {
         temp = temp*10 +digits[k];
      }
      return temp>Integer.MAX_VALUE ? -1 : (int)temp;
    }
    public static void reverse(int start, int end,int[] arr)
    {
      while(start<=end)
      {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] =  temp;
        start++;
        end--;
      }
    }
    public static void swap(int n1 , int n2, int[] arr)
    {
        int temp= arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
