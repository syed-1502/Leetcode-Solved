class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            if(nums[i]<9&&nums[i]==i) return i;
            else{
                int val=nums[i];
                while(val>0){
                    sum+=val%10;
                    val/=10;
                }
            }
            if(sum==i) return i;
            sum=0;
        }
        return -1;
    }
}