class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
      HashSet<Integer> ok = new HashSet<>();
      for(int i = 0;i<nums.length;i++){
          ok.add(nums[i]);
      }
      ArrayList<ListNode> ans = new ArrayList<>();
      ListNode temp = head;
      while(temp!= null){
        if(!ok.contains(temp.val)) ans.add(temp);
        temp = temp.next;
      }
      for(int i = 0;i<ans.size()-1;i++){
            ans.get(i).next = ans.get(i+1);
        }
        ans.get(ans.size()-1).next = null;
        return ans.get(0);
    }
}