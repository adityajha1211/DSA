class Solution {
    public String clearDigits(String s) {
        if(s.length()==0) return s;
        Stack<Character> ans = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(!ans.empty() && Character.isDigit(c)){
                ans.pop();
            } else {
                ans.push(c);
            }
        }
        String jha = "";
        while(!ans.empty()){
            jha = ans.pop() + jha;
        }
        // String ok = new StringBuilder(jha).reverse().toString();
        // return ok;
        return jha;
    }
}