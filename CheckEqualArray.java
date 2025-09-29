public static boolean checkEqual(int[] a, int[] b) {
//Given two arrays a[] and b[] of equal size, the task is to find whether the elements in the arrays are equal.
//Two arrays are said to be equal if both contain the same set of elements, arrangements (or permutations) of elements may be different though.
//Note: If there are repetitions, then counts of repeated elements must also be the same for two arrays to be equal.
//Examples:
//Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
//Output: true
//Explanation: Both the array can be rearranged to [0,1,2,4,5]
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        int n = a.length;
        for(int i =0;i<n;i++)
        {
            if(a[i]!=b[i])
             return false;
        }
        return true;
    }
