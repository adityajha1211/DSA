class Solution {
    public int evalRPN(String[] tokens) {
        List<String> ans = new ArrayList<>(Arrays.asList(tokens));
        while(ans.size()>1){
            for(int i = 0;i<ans.size();i++){
                String t = ans.get(i);
                if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){
                    int a = Integer.parseInt(ans.get(i-2));
                    int b = Integer.parseInt(ans.get(i-1));
                    int val = 0;
                    if(t.equals("+")) val = a+b;
                    else if(t.equals("-")) val = a-b;
                    else if(t.equals("*")) val = a*b;
                    else val = a/b;
                    ans.set(i-2,String.valueOf(val));
                    ans.remove(i);
                    ans.remove(i-1);
                    break;
                }
            }
        }
        return Integer.parseInt(ans.get(0));
    }
}