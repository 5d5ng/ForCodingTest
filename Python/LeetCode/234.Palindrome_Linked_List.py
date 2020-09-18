# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def isPalindrome(self, head):
        res = []
        while head:
            res.append(head.val)
            head = head.next
        center = int(len(res)/2)
        if(len(res)%2==0):
            return res[:center] == res[:center-1:-1]
        else:
            return res[:center] == res[:center:-1]
        