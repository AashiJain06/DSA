class Job
{
    int profit;
    int deadline;
    public Job(int deadline , int profit)
    {
        this.deadline = deadline;
        this.profit = profit;
    }
}
class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
       
        int n = profit.length;
        Job[] jobs = new Job[n];
        for(int i =0;i<n;i++)
        {
            jobs[i] = new Job(deadline[i],profit[i]);
        }
        Arrays.sort(jobs,(a,b)->a.deadline-b.deadline);
        // int maxDeadline = Integer.MIN_VALUE;
        // for(int i = 0 ;i<n;i++)
        // {
        //     maxDeadline = Math.max(deadline[i],maxDeadline);
        // }
        // boolean[] slots = new boolean[maxDeadline];
        // int count =0;
        // int totalProfit =0;
        // ArrayList<Integer> ans = new ArrayList<>();
        // for(Job job : jobs)
        // {
        //     for(int j =job.deadline-1;j>=0;j--)
        //     {
        //         if(!slots[j])
        //         {
        //             count++;
        //             totalProfit+=job.profit;
        //             slots[j] = true;
        //             break;
        //         }
        //     }
        // }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(Job job : jobs)
        {
            pq.offer(job.profit);
            if(pq.size()>job.deadline)
            {
                pq.poll();
            }
        }
        int totalProfit =0;
        for(int p : pq)
        {
            totalProfit+=p;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(pq.size());
        ans.add(totalProfit);
        return ans;
    }
}
