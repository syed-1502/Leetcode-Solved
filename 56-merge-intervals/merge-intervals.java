class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<List<Integer>> li=new ArrayList<>();
        int s=intervals[0][0];
        int e=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            List<Integer> l1=new ArrayList<>();
            
            if(intervals[i][0]<=e){ 
                e=Math.max(e,intervals[i][1]);

            }
            else
            {
                l1.add(s);
                l1.add(e);
                li.add(l1);
                s=intervals[i][0];
                e=intervals[i][1];
            }
        }
        List<Integer> l1=new ArrayList<>();
        l1.add(s);
        l1.add(e);
        li.add(l1);
        int [][]mat=new int[li.size()][2];
        for(int i=0;i<li.size();i++)
        {
            mat[i][0]=li.get(i).get(0);
            mat[i][1]=li.get(i).get(1);
        }

        for(int i=0;i<li.size();i++)
        {
            System.out.println(li.get(i));
        }
        return mat;
    }
}