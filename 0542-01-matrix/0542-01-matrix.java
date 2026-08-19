class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]>q=new LinkedList<>();
        int[][] ans=new int[mat.length][mat[0].length];
        int dis=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                }
            }
        }
        int[][] dir={
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };
        while(!q.isEmpty()){
            int s=q.size();
           
            for(int i=0;i<s;i++){
            int[] cur=q.poll();
            int r=cur[0];
            int c=cur[1];
                for(int [] d:dir){
                    int nr=r+d[0];
                    int nc=c+d[1];
                    if(nr>=0 && nr<mat.length && nc>=0 && nc<mat[0].length){
                        if(mat[nr][nc]==1){
                            ans[nr][nc]=ans[r][c]+1;
                            mat[nr][nc]=0;
                            q.offer(new int[]{nr,nc});
                        }
                    }
                 }
            }
        }
        return ans;
    }
}