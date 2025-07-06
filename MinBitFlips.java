class MinBitFlips {
    public int minBitFlips(int start, int goal) {
        int count=0;
        int res=start^goal;
        for(int i=0;i<32;i++){
            if((res & (1<<i))!=0)
            count++;
        }
        return count;
    }
}