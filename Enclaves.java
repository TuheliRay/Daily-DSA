import java.util.LinkedList;
import java.util.Queue;
class Enclaves {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        Queue<int[]> q=new LinkedList<>();
        int moves=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==m-1 || j==n-1){
                    if(grid[i][j]==1){
                        vis[i][j]=true;
                        q.add(new int[]{i , j});
                    }
                }
            }
        }
        while(!q.isEmpty()){
            int curr[]=q.poll();
            int r=curr[0];
            int c=curr[1];
            int drow[]={-1 , 0 , 1 , 0};
            int dcol[]={0 , 1 , 0 , -1};
            for(int i=0;i<4;i++){
               int nrow=r+drow[i];
               int ncol=c+dcol[i];
               if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==false && grid[nrow][ncol]==1){
                q.add(new int[]{nrow , ncol});
                vis[nrow][ncol]=true;
               }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==false && grid[i][j]==1)
                moves++;
            }
        }
        return moves;
    }
}