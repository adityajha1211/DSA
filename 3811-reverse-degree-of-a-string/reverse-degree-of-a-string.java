class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int sum = 0;
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            int ok = 26-(ch - 'a' + 1)+1;
            sum = sum+ok*(i+1);
        }
        return sum;
    }
}