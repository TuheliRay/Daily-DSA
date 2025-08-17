import java.util.Arrays;
class NonOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int n=intervals.length;
        int cnt=1;
        int lastendtime=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]>=lastendtime){
                cnt++;
                lastendtime=intervals[i][1];
            }
        }
        return n-cnt;
    }
}