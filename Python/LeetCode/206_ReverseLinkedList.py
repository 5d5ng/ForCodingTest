# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def reverseList(self, head):
        temp = head
        ans = None
        while(temp != None):
            nextTemp = temp.next
            temp.next = ans
            ans = temp
            temp = nextTemp
        return ans

    def reverseList2(self, head):
        prev = None
        while head:
            next = head.next
            head.next = prev
            prev = head
            head = next
        return prev

    def reverseList3(self,head):
        prev = None
        def reverse(node,prev):
            if not node:
                return prev
            next, node.next = node.next, prev
            return reverse(next,node)
        return reverse(head,prev)

