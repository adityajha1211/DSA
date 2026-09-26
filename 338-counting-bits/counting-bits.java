class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i = 0;i<=result.length-1;i++){
            result[i] = Count(i);
        }
        return result;
    }
    private int Count(int n){
        int count = 0;
        while(n>1){
            if(n%2==1) count++;
            n=n/2;
        }
        if(n==1) count++;
        return count;
    }
}