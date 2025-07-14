import java.util.LinkedList;
import java.util.Queue;
class RottenOranges {
    public int orangesRotting(int[][] grid) {
        Queue<int []> q=new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;
        int visited[][]=new int[m][n];
        //adding the initial rotten oranges to the queue 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i , j ,0});
                    visited[i][j]=2;
                }
                else
                visited[i][j]=0;
            }
        }  
        int time=0;
        int drow[]={-1 , 0 , 1 , 0};
        int dcol[]={0 , +1 , 0 , -1};
        while(!q.isEmpty()){
            int[] current = q.peek();
            int r=current[0];
            int c=current[1];
            int t=current[2];
            time=Math.max(time , t);
            q.poll();
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && visited[nrow][ncol]!=2  && grid[nrow][ncol]==1){
                    q.add(new int[]{nrow , ncol ,t+1});
                    visited[nrow][ncol]=2;
                }
            }
        } 
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
            if( visited[i][j]!=2 && grid[i][j]==1)
            return -1;
           }
        }
        return time;
    }
}
