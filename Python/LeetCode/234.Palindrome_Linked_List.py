# Definition for singly-linked list.
import collections
from typing import Deque


class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
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

    def isPalindrome2(self,head:ListNode)->bool:
        q : Deque = collections.deque()
        if not head:
            return True

        node = head
        while node is not None:
            q.append(node.val)
            node = node.next

        while len(q)>1:
            if q.popleft() != q.pop():
                return False
        return True

    def isPalindrome3(self,head:ListNode)-> bool:
        rev = None
        slow = fast = head

        #런너를 이용해 역순 연결리스트 구성
        while fast and fast.next: #노드가 짝수 개인 경우를 대비해서 fast.next추가

            fast = fast.next.next
            rev , rev.next , slow = slow , rev ,slow.next


        if fast: #노드가 짝수인경우
            slow = slow.next
        while rev and rev.val == slow.val:
            slow , rev = slow.next , rev.next
        return not rev

app = Solution()




        