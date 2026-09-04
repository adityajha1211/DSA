class Solution {
    public List<String> letterCombinations(String s) {
        Map<Character,String> map = getMap();
        List<String> ans = new ArrayList<>();
        if(s.length()==0) return ans;
        Okay(0,s,"",ans,map);
        return ans;
    }
    private void Okay(int index, String s, String ok,List<String> ans, Map<Character,String> map){
        if(index==s.length()){
            ans.add(ok);
            return;
        }
        for(char c:map.get(s.charAt(index)).toCharArray()){
            String temp = new String(ok);
            temp = temp+c;
            Okay(index+1,s,temp,ans,map);
        }
    }
    private Map<Character,String> getMap(){
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        return map;
    }
}