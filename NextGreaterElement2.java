import java.util.*;
class NextGreaterElement2 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int nge[]=new int[n];
        for(int i=(2*n-1) ; i>=0 ; i--){
            while(!st.isEmpty() && nums[i%n]>=st.peek()){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty())
                nge[i]=-1;
                else
                nge[i]=st.peek();
            }
            st.push(nums[i%n]);
        }
        return nge;
    }
}