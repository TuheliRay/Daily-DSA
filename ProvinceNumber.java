class ProvinceNumber {
    //DFS traversal
        public void dfs(int node ,int[][] isConnected, boolean vis[]){
            if(vis[node])
            return;
            vis[node]=true;
            for(int i=0;i<isConnected[node].length;i++){
                if(isConnected[node][i]==1){
                    dfs(i , isConnected , vis);
                }
            }

        }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected[0].length;
        //count provinces
        boolean vis[]=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                count++;
                dfs(i , isConnected , vis);
            }
        }
        return count;
    }
}