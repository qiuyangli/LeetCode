class Solution(object):
    def hasCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        p1 = p2 = head
        if head:
            while p2.next and p2.next.next:
                p1 = p1.next
                p2 = p2.next.next
                if p1 == p2:
                    return True
        return False