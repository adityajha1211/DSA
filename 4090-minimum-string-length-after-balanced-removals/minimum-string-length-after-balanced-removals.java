class Solution {
    public int minLengthAfterRemovals(String s) {
        int n = s.length();
        Stack<Character> ans  = new Stack<>();
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if(ans.isEmpty()) ans.push(ch);
            else if(ans.peek() =='a' && ch=='b') ans.pop();
            else if(ans.peek() =='b' && ch=='a') ans.pop();
            else ans.push(ch);
        }
        return ans.size();
    }
}