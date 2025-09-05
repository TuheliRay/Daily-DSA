import java.util.*;
class CycleDetect {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[]:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i]==false)
            if(dfs( i , -1 , vis , adj) == true) return true ;
        }
        return false;
    }
    public boolean dfs(int node , int parent , boolean vis[] , ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        for(int adjNode : adj.get(node)){
            if(vis[adjNode]==false){
                vis[adjNode]=true;
                if(dfs(adjNode , node , vis , adj) == true) return true;
            }
            else{
                if(adjNode!=parent)
                return true;
            }
        }
        return false;
    }
}