public class RotatedSortedArraySearch {
  int search(int[] arr, int key) {
       int n = arr.length;
       int low =0;
       int high = n-1;
       while(low<=high)
       {
           int mid = (low + high)/2;
           if(arr[mid]==key)
           return mid;
           if(arr[mid]>=arr[low])
           {
               if(arr[low]<=key && arr[mid]>=key)
               high = mid-1;
               else
               low = mid+1;
           }
           else
           {
               if(arr[mid]<=key && arr[high]>=key)
               low = mid +1;
               else
               high = mid -1;
           }
       }
       return -1; 
}
