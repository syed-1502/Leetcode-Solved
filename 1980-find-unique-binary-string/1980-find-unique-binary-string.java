class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            arr[i] = Integer.parseInt(nums[i], 2);
        }
        Arrays.sort(arr);
        int val = 0;
        for(int i = 0; i < nums.length; i++) {
            if(arr[i] != val) {
                return padBinary(val, nums.length);
            }
            val++;
        }
        return padBinary(val, nums.length);
    }
    public String padBinary(int num, int n) {
        String s = Integer.toBinaryString(num);

        while(s.length() < n) {
            s = "0" + s;
        }
        return s;
    }
}