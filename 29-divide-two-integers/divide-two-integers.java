class Solution {
    public int divide(int dividend, int divisor) {
      if(dividend == divisor) return 1;
      long sign = 1;
      if(dividend>=0 && divisor<0) sign = -1;
      if(dividend<0 && divisor>0) sign = -1;
      long n= Math.abs((long)dividend), d = Math.abs((long)divisor);
      long ans = 0;
      while(n>=d){
        int count = 0;
        while(n>=(d<<(count+1))){
            count++;
        }
        ans += (1L<<count);
        n = n-(d<<count);
      }
      if(sign==-1) ans = -ans;
      if(ans>Integer.MAX_VALUE && sign==1) return Integer.MAX_VALUE;
      if(ans>=Integer.MAX_VALUE && sign == -1) return Integer.MIN_VALUE;
      return (int) ans;
    }
}