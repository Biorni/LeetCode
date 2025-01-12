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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode(0);
        ListNode pointer = head;

        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val){
                ListNode v = new ListNode(list1.val);
                pointer.next=v;
                list1 = list1.next;
                pointer = pointer.next;
            } else {
                ListNode v = new ListNode(list2.val);
                pointer.next=v;
                list2 = list2.next;
                pointer = pointer.next;
            }
        }

        if(list1!=null){
            pointer.next = list1;
        }else{
            pointer.next = list2;
        }
        
        return head.next;
    }
}