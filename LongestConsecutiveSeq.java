import java.util.HashSet;
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int val=0;int cnt=1;int maxcnt=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                cnt=1;
                val=num;
            while(set.contains(val+1)){
                cnt++;
                val++;
            }
            maxcnt=Math.max(maxcnt , cnt);
            }
        }
        return maxcnt;
    }
}