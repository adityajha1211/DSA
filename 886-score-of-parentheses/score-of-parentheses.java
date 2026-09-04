class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> ans  = new Stack<>();
        ans.push(0);

        for(char c : s.toCharArray()){
            if(c == '(') ans.push(0);
            else{
            int score = ans.pop();
            int value = Math.max(2*score,1);
            int jha = value+ans.pop();
            ans.push(jha);
        }
    }
    return ans.pop();
}
}