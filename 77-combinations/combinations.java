class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans  = new ArrayList<>();
        ArrayList<Integer> ok = new ArrayList<>();
        Okay(1,n,ans,ok,k);
        return ans;
    }
    private void Okay(int index, int n,List<List<Integer>> ans,ArrayList<Integer> ok,int k){
     if(k==0){
        ans.add(new ArrayList<>(ok));
        return;
     }
     if(index > n) return;
     for(int i = index;i<=n;i++){
        ok.add(i);
        Okay(i+1,n,ans,ok,k-1);
        ok.remove(ok.size()-1);
     }
    }
}