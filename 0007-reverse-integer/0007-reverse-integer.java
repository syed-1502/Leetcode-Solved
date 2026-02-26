class Solution {
    public int reverse(int x) {
        int sign=0;
        if(x>0) sign=1;
        else {
            sign=-1;
            x*=-1;
        }
        long val=0;
        while(x>0)
        {
            val*=10;
            val+=x%10;
            x/=10;
        }
        if(val>=Integer.MAX_VALUE) return 0;
        return (int)(sign*val);
    }
}