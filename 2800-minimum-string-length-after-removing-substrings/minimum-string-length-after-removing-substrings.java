class Solution {
    public int minLength(String s) {
       int n = s.length();
       Stack<Character> ok = new Stack<>();
       for(int i = 0;i<n;i++){
        char ch = s.charAt(i);
        if(ok.isEmpty()) ok.push(ch);
        else if(ch=='B' && ok.peek()=='A') ok.pop();
        else if(ch=='D' && ok.peek()=='C') ok.pop();
        else ok.push(ch);
       }
       return ok.size();
    }
}