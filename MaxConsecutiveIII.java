class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0 , r=0;
        int maxcons1=0, cnt0=0;
        int n=nums.length;
        while(r<n){
            if(nums[r]==0){
                cnt0++;
            }
            while(cnt0>k){
                if(nums[l]==0)
                cnt0--;
                l++;
            }
            maxcons1=Math.max(maxcons1 , r-l+1);
            r++;
        }
        return maxcons1;
    }
}