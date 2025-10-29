// User function Template for Java
class DisjointSet{
    int parent [];
    int size [];
    DisjointSet(int n){
        parent = new int[n + 1];
        size = new int[n + 1];
        for(int i=0 ; i<=n ; i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    public void unionBySize(int u , int v){
        int ulp_u=findPar(u);
        int ulp_v=findPar(v);
        if(ulp_u==ulp_v)
        return;
        if(size[ulp_u] < size[ulp_v]){
            parent[ulp_u]=ulp_v;
            size[ulp_v]+=size[ulp_u];
        }
        else{
            parent[ulp_v]=ulp_u;
            size[ulp_u]+=size[ulp_v];
        }
    }
    
    public int findPar(int node){
        if(node==parent[node])
        return node;
        return parent[node]=findPar(parent[node]);
        
    }
}
class Edge implements Comparable<Edge>{
    int src , dest , wt;
    Edge(int source , int destination , int weight){
        this.src=source;
        this.dest=destination;
        this.wt=weight;
    }
    public int compareTo(Edge edge){
        return this.wt-edge.wt;
    }
}
class Kruskal {
    static int kruskalsMST(int V, int[][] edges) {
        // code here
        ArrayList<Edge> list = new ArrayList<>();
        for(int i=0 ; i<edges.length ; i++){
            int u=edges[i][0];
            int v= edges[i][1];
            int wt=edges[i][2];
            Edge temp=new Edge(u , v , wt);
            list.add(temp);
        }
        Collections.sort(list);
        DisjointSet ds=new DisjointSet(V);
        int mstWt=0;
        for(int i=0 ; i<list.size() ; i++){
            int wt=list.get(i).wt;
            int u=list.get(i).src;
            int v=list.get(i).dest;
            if(ds.findPar(u)!=ds.findPar(v)){
                mstWt+=wt;
                ds.unionBySize(u , v);
            }
        }
        return mstWt;
    }
}
