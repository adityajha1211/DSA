class Solution {
    public int findTheLongestSubstring(String s) {
        int ans = 0;
        int xor = 0;
        HashMap<Integer,Integer> ok = new HashMap<>();
        ok.put(0,-1);
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') xor = xor^ch;
            if(ok.containsKey(xor)) ans = Math.max(ans,i-ok.get(xor));
            else ok.put(xor,i);
        }
        return ans;
    }
}