class Solution {
    public boolean isPowerOfTwo(int n) {
    //     if(n<=0) return false;
    //     if(n==1) return true;
    //  while(n!=1){
    //     if(n%2 != 0) return false;
    //     else n = n/2;
    //  }
    //  return true;
    if(n<=0) return false;
    // if(n==1) return true;
    return ((n&(n-1))==0);
    }
}