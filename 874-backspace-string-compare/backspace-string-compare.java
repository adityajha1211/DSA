class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> ans = new Stack<>();
        Stack<Character> jha = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ans.isEmpty() && ch =='#') ans.push(ch);
            if(ch == '#') ans.pop();
            else ans.push(ch);
        }
         for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
            if(jha.isEmpty() && ch =='#') jha.push(ch);
            if(ch == '#') jha.pop();
            else jha.push(ch);
        }
       String ok = "";
       while(!ans.isEmpty()) ok = ok + ans.pop();
       String ok2 = "";
       while(!jha.isEmpty()) ok2 = ok2 + jha.pop();
       if(ok.length() != ok2.length()) return false;
       for(int i = 0;i<ok.length();i++){
        if(ok.charAt(i) != ok2.charAt(i)) return false;
       }
       return true;
    }
}