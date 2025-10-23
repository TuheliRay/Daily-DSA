class SortStack {
    public void sortStack(Stack<Integer> st) {
        // code here
        if(!st.isEmpty()){
            int temp=st.pop();
            sortStack(st);
            insertElement(st , temp);
        }
    }
    public void insertElement(Stack<Integer> st , int ele){
        if(st.isEmpty() || st.peek()<ele){
            st.push(ele);
            return;
        }
        int temp=st.pop();
        insertElement(st , ele);
        st.push(temp);
    }
}