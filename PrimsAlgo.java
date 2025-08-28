import java.util.*; 
class Pair{
    int wt;
    int node;
    Pair(int weight , int node){
        this.wt=weight;
        this.node=node;
    }
}
class Solution {
    public int spanningTree(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        adj.add(new ArrayList<>());
        for(int edge[]: edges){
            int u=edge[0],v=edge[1],w=edge[2];
            adj.get(u).add(new Pair(w , v));
            adj.get(v).add(new Pair(w , u));
        }
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>((x , y)->x.wt-y.wt);
        boolean vis[]=new boolean[V];
        pq.add(new Pair(0 , 0));
        int sum=0;
        while(!pq.isEmpty()){
            int wt=pq.peek().wt;
            int node=pq.peek().node;
            pq.remove();
            if(vis[node]==false){
                vis[node]=true;
                sum=sum+wt;
                for(Pair it:adj.get(node)){
                    pq.add(new Pair(it.wt , it.node));
                }
            }
        }
        return sum;
    }
}
