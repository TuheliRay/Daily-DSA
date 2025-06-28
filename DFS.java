import java.util.ArrayList;
class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ls=new ArrayList<>();
        int V = adj.size();
        boolean vis[]=new boolean[V];
        findDFS( 0 , vis , ls , adj);
        return ls;
    }
    //Function for the traversal
    public void findDFS(int node , boolean vis[] , ArrayList<Integer> ls , ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        ls.add(node);
        for(int val : adj.get(node)){
            if(vis[val]==false){
                findDFS( val , vis , ls , adj);
            }
        }
        
    }
}