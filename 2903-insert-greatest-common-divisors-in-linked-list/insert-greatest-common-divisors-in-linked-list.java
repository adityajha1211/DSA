/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ArrayList<ListNode> ans = new ArrayList<>();
        ArrayList<ListNode> jha = new ArrayList<>();
        ListNode tail = dummy;
        ListNode temp = head;

        while(temp.next!=null){
        ans.add(temp);
        jha.add(Okay(temp,temp.next));
        temp = temp.next;
        }
        ans.add(temp);
        int p = 0;
        for(int i = 0;i<ans.size();i++){
            tail.next = ans.get(i);
            tail = tail.next;
            if(p<jha.size()){
                tail.next = jha.get(p++);
                tail = tail.next;
            }
        }
        return dummy.next;
    }
    private ListNode Okay (ListNode a, ListNode b){
       int p=a.val;
       int q=b.val;
       while(q!=0){
         int reminder = p%q;
         p = q;
         q = reminder;
       }
         ListNode s = new ListNode(p);
        return s;
    }
}