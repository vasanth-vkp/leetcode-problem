class Solution {
    public int orangesRotting(int[][] grid) {
        int time=0;
        int good=0;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    good++;
                }
            }
        }
        int[][] dir={
            {-1,0},
            {0,1},
            {0,-1},
            {1,0}
        };

        while(!q.isEmpty() && good>0){
            int s=q.size();
            for (int i=0;i<s; i++) {
            int[]cur=q.poll();
            int r=cur[0];
            int c=cur[1];
            for(int[] d:dir){
                int nr=d[0]+r;
                int nc=d[1]+c;
                if(nr>=0&& nr<grid.length && nc>=0 && nc<grid[0].length){
                    if(grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        good--;
                        q.offer(new int[]{nr,nc});
                    }
                }

            }
            }
            time++;
        }
        if(good>0){
            return -1;
        }
        return time;
        
    }
}