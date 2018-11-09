public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> node = new HashSet<ListNode>();
        while (head != null) {
            if (node.contains(head)) {
                return true;
            } else {
                node.add(head);
            }
            head = head.next;
        }
        return false;
       
    }
}