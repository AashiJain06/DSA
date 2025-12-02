class Solution {
    public int thirdMax(int[] nums) {
        // Arrays.sort(nums);
        // List<Integer> list = new ArrayList<>();
        
        // list.add(nums[0]);
        // for(int i = 1; i < nums.length; i++){
        //     if(nums[i-1] != nums[i]){
        //         list.add(nums[i]);
        //     }
        // }
        // int listSize = list.size();
        // if(listSize < 3){
        //     return list.get(listSize - 1);
        // }

        // return list.get(listSize - 3);
        long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;

        for(int i: nums){
            if(i > first){
                third = second;
                second = first;
                first = i;
            }
            else if(i > second && i != first){
                third = second;
                second = i;
            }
            else if(i >= third && i != first && i != second){
                third = i;
            }
        }

        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }
}
