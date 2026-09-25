class Solution {
    public int mySqrt(int x) {
        int s=1,e=x,ans=0;
        if(x==1||x==0) return x;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(mid*mid==x) return mid;
            if (mid<=x/mid)
            {
                ans=mid;
                s=mid+1;
            }
            else e=mid-1;
        }
        return ans;
    }
}