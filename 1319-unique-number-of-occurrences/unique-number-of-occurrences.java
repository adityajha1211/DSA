class Solution {
    public boolean uniqueOccurrences(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int num: nums){
            ans.put(num,ans.getOrDefault(num,0)+1);
        }
        HashSet<Integer> ok = new HashSet<>();
        for(int value : ans.values()){
            ok.add(value);
        }
        if(ans.size()==ok.size()) return true;
        else return false;
    }
}