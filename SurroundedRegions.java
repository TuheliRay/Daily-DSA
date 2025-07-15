class SurroundedRegions {
    public void dfs(int r , int c , int drow[] , int dcol[] , char board[][] , boolean vis[][] , int m , int n){
        vis[r][c]=true;
        for(int i=0;i<4;i++){
            int nrow=r+drow[i];
            int ncol=c+dcol[i];
            if( nrow>=0 && nrow<m && ncol<n && ncol>=0 &&board[nrow][ncol]=='O' && vis[nrow][ncol]==false)
            dfs(nrow , ncol , drow , dcol , board , vis , m , n);
        }
    }
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int drow[]={-1 , 0 , 1 , 0};
        int dcol[]={0 , 1 , 0 , -1};
        boolean vis[][]=new boolean[m][n];
        for(int j=0;j<n;j++){
            if(vis[0][j]==false && board[0][j]=='O')
            dfs(0 , j , drow , dcol , board , vis , m , n);
            if(vis[m-1][j]==false && board[m-1][j]=='O')
            dfs(m-1 , j , drow , dcol , board , vis , m , n);
        }
        for(int i=0;i<m;i++){
            if(vis[i][0]==false && board[i][0]=='O')
            dfs(i , 0 , drow , dcol , board , vis , m , n);
            if(vis[i][n-1]==false && board[i][n-1]=='O')
            dfs(i , n-1 , drow , dcol , board , vis , m , n);
        }
        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(board[i][j]=='O' && vis[i][j]==false)
            board[i][j]='X';
        }
    }
    }
}