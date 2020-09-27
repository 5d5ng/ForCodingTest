from typing import List


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:

    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        nextval = 0
        temp = l1
        prev1 = ListNode()
        prev2 = ListNode()
        while l1 and l2:

            l1.val += l2.val + nextval
            nextval = l1.val // 10
            if nextval > 0:
                l1.val %= 10

            prev1, prev2 = l1, l2
            l1, l2 = l1.next, l2.next

        while l1:
            l1.val += nextval
            nextval = l1.val // 10
            if nextval > 0:
                l1.val %= 10
            prev1 = l1
            l1 = l1.next
        if nextval > 0:
            prev1.next = ListNode(nextval)
        temp2 = l2
        while l2:
            l2.val += nextval
            nextval = l2.val // 10
            if nextval > 0:
                l2.val %= 10
            prev2 = l2
            l2 = l2.next
        if nextval > 0:
            prev2.next = ListNode(nextval)
        if temp2:
            prev1.next = temp2

        return temp

    def addTwoNumbers2(self, l1: ListNode, l2: ListNode) -> ListNode:
        root = head = ListNode()

        carry = 0
        while l1 or l2 or carry:
            sum = 0
            if l1:
                sum+=l1.val
                l1 = l1.next
            if l2:
                sum += l2.val
                l2 = l2.next

            carry,val =divmod(sum+carry,10) # divmod는 몫과 나머지를 투플형태로 저장하는 내장함수 (a//b,a%b)
            head.next = ListNode(val)
            head = head.next
        return root.next

    def reverseList(self,head: ListNode) -> ListNode:
        node,prev = head,None
        while node:
            next, node.next = node.next , prev
            prev , node = node,next

        return prev



app = Solution()
