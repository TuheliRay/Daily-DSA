import java.util.LinkedList;
import java.util.Queue;
class Matrix01 {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        Queue<int[]> q=new LinkedList<>();
        boolean vis[][]=new boolean[m][n];
        int dist[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i , j , 0});
                    vis[i][j]=true;
                }
                else
                vis[i][j]=false;
            }
        }
        while(!q.isEmpty()){
            int curr[]=q.poll();
            int r=curr[0];
            int c=curr[1];
            int nearZero=curr[2];
            dist[r][c]=nearZero;
            int drow[]={-1 ,  0 , 1 , 0};
            int dcol[]={0 , 1 , 0 , -1};
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==false){
                    q.add(new int[]{nrow , ncol , nearZero+1});
                    vis[nrow][ncol]=true;
                }
            }
        }
        return dist;
    }
}