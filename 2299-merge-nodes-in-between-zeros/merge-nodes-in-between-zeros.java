class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode temp = head.next;
        int sum = 0;

        while(temp != null){
           if(temp.val != 0){
            sum = sum+ temp.val;
           } else {
            ListNode jha = new ListNode(sum);
            tail.next = jha;
            tail = tail.next;
            sum = 0;
           }
           temp = temp.next;
        }
        return dummy.next;
    }
}