class Solution {
    public boolean checkString(String s) {
        if(s.length()>=2 && s.charAt(0)=='b' && s.charAt(1)=='a') return false;
        ArrayList<Integer> ans = new ArrayList<>();
        int n = s.length();
        for(int i = 0;i<n;i++){
            if(s.charAt(i)=='a') ans.add(i);
        }
        int m = ans.size();
        for(int i = 1;i<m;i++){
            if(ans.get(i)!= ans.get(i-1)+1) return false;
        }
        return true;
    }
}