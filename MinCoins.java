import java.util.ArrayList;
import java.util.List;
class MinCoins {
    static List<Integer> minPartition(int N) {
        // code here
        ArrayList <Integer> list=new ArrayList<>();
        int coins[]={1 , 2 , 5 , 10 , 20 , 50 , 100 , 200 , 500 , 2000};
        int l=coins.length;
        for(int i=l-1;i>=0;i--){
            while(coins[i]<=N){
                list.add(coins[i]);
                N=N-coins[i];
            }
        }
        return list;
    }
}