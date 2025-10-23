class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        generate("" , 0 , 0 , ans , n);
        return ans;
    }
    public void generate(String curr , int open , int close , List<String> ans , int n){
        if(curr.length()==2*n){
            ans.add(curr);
            return;
        }
        if(open<n)
        generate(curr+"(" , open+1 , close , ans , n);
        if(close<open)
        generate(curr+")" , open , close+1 , ans , n);
    }
}