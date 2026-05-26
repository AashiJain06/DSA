class Activity
{
    int start;
    int finish;
    public Activity(int start , int finish)
    {
        this.start = start;
        this.finish = finish;
    }
}
class Solution {
    public int activitySelection(int[] start, int[] finish) {
        int n = start.length;
       Activity[] activity = new Activity[n];
       for(int i =0;i<n;i++)
       {
           activity[i] = new Activity(start[i],finish[i]);
       }
       Arrays.sort(activity,(a,b)->Integer.compare(a.finish,b.finish));
       int lastTime = activity[0].finish;
       int count =1;
       for(int i =1;i<n;i++)
       {
           if(activity[i].start>lastTime)
           {
               count++;
               lastTime = activity[i].finish;
           }
       }
       return count;
    }
}
