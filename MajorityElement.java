class MajorityElement {
    public int majorityElement(int[] nums) {
        int l=nums.length;
        int cnt=0;
        int ele=0;
        for(int i=0;i<l;i++){
            if(cnt==0){
                ele=nums[i];
                cnt=1;
            }
            else if(ele==nums[i])
            cnt++;
            else
            cnt--;
        }
        return ele;
    }
}