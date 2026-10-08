class Solution {
    public ListNode doubleIt(ListNode head) {
     ListNode ans = new ListNode(-1);
     ListNode ok = ans;
     head = Reverse(head);
     ListNode temp = head;
     int carry  = 0;
     while(temp != null){
        int sum = temp.val*2+carry;
        carry = sum/10;
        int val = sum%10;
        ListNode jha = new ListNode(val);
        ok.next = jha;
        ok = ok.next;
        temp = temp.next;
     }
     if(carry!=0) ok.next = new ListNode(carry);
     return Reverse(ans.next);
    }
    private ListNode Reverse(ListNode head){
        if(head == null) return null;
        ListNode temp = head;
        ArrayList<ListNode> ans  = new ArrayList<>();
        while(temp != null){
            ans.add(temp);
            temp = temp.next;
        }
        int n = ans.size();
        for(int i = n-1;i>=1;i--){
            ans.get(i).next = ans.get(i-1);
        }
        ans.get(0).next = null;
        return ans.get(n-1);
    }
}