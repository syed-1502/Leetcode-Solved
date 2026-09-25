class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                char val=board[i][j];
                if(val=='.') continue;
                String row =val+" found in row "+i;
                String col=val+" found in col"+j;
                String box=val+" found in box " + (i / 3) + "-" + (j / 3);
                if(hs.contains(row)||hs.contains(col)||hs.contains(box)) return false;
                hs.add(row);
                hs.add(col);
                hs.add(box);
            }
        }
        return true;
    }
}