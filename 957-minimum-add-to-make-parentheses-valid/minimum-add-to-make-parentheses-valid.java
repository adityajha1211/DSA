class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> jha = new Stack<>();
        int ok = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(') jha.push(ch);
            else{
                if(jha.size() != 0){
                    jha.pop();
                } else{
                    ok++;
                }
            }
        }
        return jha.size()+ok;
    }
}