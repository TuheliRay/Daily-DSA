

class XORinRange {
    public static int findXOR(int l, int r) {
         //your code goes here
         int ans=XOR(l-1) ^ XOR(r);
         return ans;
    }
    public static int XOR(int N){
        if(N%4==1)
        return 1;
        else if(N%4==2)
        return N+1;
        else if(N%4==3)
        return 0;
        else 
        return N;
    }
}