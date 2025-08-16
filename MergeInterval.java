import java.util.ArrayList;
import java.util.Arrays;
class MergeInterval {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> list=new ArrayList<>();
        int pair[]=intervals[0];
        for(int i=0;i<n;i++){
            if(pair[1]>=intervals[i][0]){
                pair[1]=Math.max(pair[1] , intervals[i][1]);
            }
            else{
                list.add(pair);
                pair=intervals[i];
            }
        } 
        list.add(pair); 
        int res[][]=new int[list.size()][];
        for(int i=0 ; i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}