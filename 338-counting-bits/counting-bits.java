class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i = 0;i<=n;i++){
        int ok = i;
        int count = 0;
        while(ok>1){
            if(ok%2==1) count++;
            ok=ok/2;
        }
        if(ok==1) count++;
        result[i] = count;
        }
        return result;
    }
}