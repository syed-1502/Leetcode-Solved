class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        //if(i<=-1) return digits;
        while(i>=0)
        {
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }
            else
            {
                digits[i]=0;
            }
            i--;
        }
        System.out.print("hii");
        int[] arr = new int[digits.length+1];
        arr[0]=1;
        for(int j=1;j<i;j++)
        {
            arr[j]=0;
        }
        return arr;
    }
}