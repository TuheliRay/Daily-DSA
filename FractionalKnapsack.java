
import java.util.Arrays;
import java.util.Comparator;

class FractionalKnapsack {
    class Item{
        int value , weight;
        Item(int x , int y){
            this.value=x;
            this.weight=y;
        }
    }
    class itemComparator implements Comparator<Item>{
        public int compare(Item a , Item b){
            double r1 = (double)(a.value) / (double)(a.weight); 
            double r2 = (double)(b.value) / (double)(b.weight);
            if(r1 < r2) return 1; 
            else if(r1 > r2) return -1; 
            else return 0;
        }
    }
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code here
        int n=values.length;
        Item arr[]=new Item[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Item(values[i], weights[i]);
        }
        Arrays.sort(arr, new itemComparator());
        double totalValue = 0.0;
        for(int i=0;i<n;i++){
            if(arr[i].weight<=W){
            totalValue+=arr[i].value;
            W-=arr[i].weight;
            }
            else{
                totalValue += ((double) arr[i].value / arr[i].weight) * W;
                break;
            }
        }
        return totalValue;
    }
}