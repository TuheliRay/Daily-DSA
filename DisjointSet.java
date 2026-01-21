// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class DisjointSet{
    int rank[];
    int parent[];
    public DisjointSet(int n){
         rank = new int[n+1];
         parent = new int[n+1];
        for(int i = 0 ; i<=n ; i ++){
            parent[i] = i;
        }
    }
    public int findUPar(int x){
        if(x == parent[x])
        return x;
        parent[x] = findUPar(parent[x]);
        return parent[x];
    }
    public void unionByRank(int u , int v){
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if(ulp_u == ulp_v)
        return;
        if(rank[ulp_u] < rank[ulp_v])
        parent[ulp_u] = ulp_v;
        else if(rank[ulp_v] < rank[ulp_u])
        parent[ulp_v] = ulp_u;
        else{
            parent[ulp_v] = ulp_u;
            rank[ulp_u]++;
        }
    }
    public static void main(String[] args){
        DisjointSet ds = new DisjointSet(7);
    ds.unionByRank(1 , 2);
    ds.unionByRank(2, 3);
    ds.unionByRank(4, 5);
    ds.unionByRank(6, 7);
    ds.unionByRank(5, 6);
     if (ds.findUPar(3) == ds.findUPar(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");

        ds.unionByRank(3, 7);
        if (ds.findUPar(3) == ds.findUPar(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");
    }
}
