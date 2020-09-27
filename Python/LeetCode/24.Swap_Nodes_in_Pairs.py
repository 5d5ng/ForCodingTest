class ListNode:
    def __init__(self,val=0,next=None):
        self.val =val
        self.next = next
class Solution:

    def swapPairs(self,head:ListNode)->ListNode:
        root = head
        while head.next:
            temp = head.next.next
            head.next.next = head
            head.next = temp
            head = head.next.next

        return root
