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
    public int getDecimalValue(ListNode head) {
//     int binary = 0;
//     ListNode temp = head;
//     while(temp!=null){
//     binary = binary*10+temp.val;
//     temp = temp.next;
//     }
//     int power = 0;
//     int decimal = 0;
//     while(binary > 0){
//     int digit = binary % 10;
//     decimal = decimal + digit * (int)Math.pow(2, power);
//     binary = binary/10;
//     power++;
//    }
//    return decimal;
        int decimal = 0;
        ListNode temp = head;
        while(temp != null) {
            decimal = decimal * 2 + temp.val;
            temp = temp.next;
        }
        return decimal;
    }
}