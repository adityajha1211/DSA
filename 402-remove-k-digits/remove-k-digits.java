class Solution {
    public String removeKdigits(String num, int k) {
        char[] s = num.toCharArray();
        Stack<Character> jha = new Stack<>();
        for(int i = 0;i<s.length;i++){
            while(!jha.empty() && k>0 && jha.peek()-'0'>s[i]-'0'){
                jha.pop();
                k = k-1;
            }
            jha.push(s[i]);
        }
            while(k>0) {
                jha.pop();
                k--;
        }
        if(jha.empty()) return "0";
        String result = "";
        while(!jha.empty()){
            result = result+ jha.peek();
            jha.pop();
        }
        while(result.length() != 0 && result.charAt(result.length() - 1)=='0'){
            result = result.substring(0, result.length() - 1);
        }
        String rev = new StringBuilder(result).reverse().toString();
        if(rev.length()==0) return "0";
        return rev;
    }
}