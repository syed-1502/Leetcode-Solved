class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        boolean [][]dp=new boolean[n][n];
        int st=0;
        int max=1;
        for(int i=0;i<n;i++)
        {
            dp[i][i]=true;
        }
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                st=i;
                max=2;
                dp[i][i+1]=true;
            }
        }
        for(int i=n-3;i>=0;i--)
        {
            for(int j=i+2;j<n;j++)
            {
                if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1])
                {
                    dp[i][j]=true;
                    int len=j-i+1;
                    if(len>max)
                    {
                        st=i;
                        max=len;
                    }
                }
            }
        }
        return s.substring(st,max+st);
    }
}