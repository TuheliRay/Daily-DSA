import java.util.*;
class CycleDetection2 {
    public boolean dfs(int node , boolean vis[] , boolean pathVis[] , ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        pathVis[node]=true;
        for(int adjNode : adj.get(node)){
            if(vis[adjNode]==false){
                if(dfs(adjNode , vis , pathVis , adj) == true) return true;
            }
            else if(pathVis[adjNode]==true)
            return true;
        }
        pathVis[node]=false;
        return false;
    }
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[] : edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
        }
        boolean vis[]= new boolean[V];
        boolean pathVis[]= new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(dfs(i , vis , pathVis , adj) == true) return true;
            }
        }
        return false;
    }
}