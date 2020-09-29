class ListNode:
    def __init__(self,val=0,next=None):
        self.val =val
        self.next = next
class Solution:

    def swapPairs(self,head:ListNode)->ListNode:
        cur = head
        while cur and cur.next:
            cur.val, cur.next.val = cur.next.val , cur.val
            cur = cur.next.next
        return cur

    def swapPairs2(self,head:ListNode)->ListNode:
        root = prev = ListNode(None)
        prev.next = head

        while head and head.next:
            # b가 head를 가리키도록 할당
            b = head.next
            head.next = b.next
            b.next = head

            prev.next = b

            head = head.next
            prev = prev.next.next
        return root.next

