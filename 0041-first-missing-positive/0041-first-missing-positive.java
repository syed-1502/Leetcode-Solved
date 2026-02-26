class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int j=1;
        //int []arr=new
        for(int i=0;i<nums.length;i++)
        {
            if(j==nums[i]) j++;
        }
        return j;
    }
}