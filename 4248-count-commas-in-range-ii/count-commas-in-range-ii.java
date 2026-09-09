class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;
        long c=1000,res=0;
        for(int i=0;i<5;i++)
        {
            if(n>=c)
            {
                res+=(n-c+1);
            }
            c*=1000;
        }
        return res;
    }
}