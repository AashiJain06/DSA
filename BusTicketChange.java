class Solution {
    public boolean canServe(int[] arr) {
        int five_rupees =0;
        int ten_rupees =0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==5)
             five_rupees++;
            if(arr[i]==10)
            {
                if(five_rupees>=1)
                {
                 ten_rupees++;
                 five_rupees--;
                }
                else
                 return false;
            }
            if(arr[i]==20)
            {
                if(ten_rupees>=1 && five_rupees>=1)
                {
                    ten_rupees--;
                    five_rupees--;
                }
                else if(five_rupees>=3)
                 five_rupees = five_rupees-3;
                else
                 return false;
            }
        }
       return true; 
    }
}
