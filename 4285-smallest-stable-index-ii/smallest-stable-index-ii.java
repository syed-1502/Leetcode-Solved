class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int []arr=new int[nums.length];
        int min=999999999;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]<min) min=nums[i];
            arr[i]=min;
            //System.out.println(arr[i]);
        }
        int max=-9999;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max) max=nums[i];
            if(max-arr[i]<=k) return i;
        }
        return -1;
    }
}