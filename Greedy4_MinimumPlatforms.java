class Train
{
    int arrival;
    int departure;
    
    public Train(int arrival , int departure)
    {
        this.arrival = arrival;
        this.departure = departure;
    }
}
class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        int n = arr.length;
        Train[] trains = new Train[n];
        for(int i =0;i<n;i++)
        {
            trains[i] = new Train(arr[i],dep[i]);
        }
        Arrays.sort(trains,(a,b)->a.arrival-b.arrival);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(trains[0].departure);
        for(int i =1;i<n;i++)
        {
            int earlyDeparture = pq.peek();
            if(trains[i].arrival>earlyDeparture)
            {
                pq.poll();
            }
            pq.offer(trains[i].departure);
        }
       return pq.size(); 
    }
}
