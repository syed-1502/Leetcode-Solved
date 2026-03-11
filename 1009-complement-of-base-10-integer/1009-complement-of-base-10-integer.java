class Solution {
    public int bitwiseComplement(int n) {
        String a = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(a);
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='1') sb.setCharAt(i,'0');
            else sb.setCharAt(i,'1');
        }
        int ans=Integer.parseInt(sb.toString(), 2);
        return ans;
    }
}