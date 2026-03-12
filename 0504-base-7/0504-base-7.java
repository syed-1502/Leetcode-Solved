class Solution {
    public String convertToBase7(int num) {
        if (num==0) return "0";
        String s="";
        int val=num;
        num=Math.abs(num);
        while(num > 0) {
            s=(num%7)+s;
            num/=7;
        }
        if(val<0) {
            s="-"+s;
        }
        return s;
    }
}