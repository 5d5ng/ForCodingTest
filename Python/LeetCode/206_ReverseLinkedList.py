# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
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
        