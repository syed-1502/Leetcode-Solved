class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length*5/100;
        double sum=0;
        for(int i=n;i<arr.length-n;i++) sum+=arr[i];
        return sum/(arr.length-2*n);
    }
}