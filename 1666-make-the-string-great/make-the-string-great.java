class Solution {
    public String makeGood(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch: s.toCharArray()){
            int length = ans.length();
            if(length>0 && Character.toLowerCase(ans.charAt(length-1)) == Character.toLowerCase(ch)&& ch!= ans.charAt(length-1)) ans.deleteCharAt(length-1);
            else ans.append(ch);
        }
        return ans.toString();
    }
}