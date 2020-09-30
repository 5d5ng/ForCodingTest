class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseBetween(self, head: ListNode, m: int, n: int) -> ListNode:
        def reverse_List(head: ListNode) -> ListNode:

            curr = head
            prev = next = None

            while curr:
                next = curr.next
                curr.next = prev
                prev = curr
                curr = next

            return prev

        if n == m: return head
        target_head = target = ListNode()
        temp = head
        cnt = 1
        prev = None

        while cnt < m:
            prev = temp
            temp = temp.next
            cnt += 1
        target_head = target = temp

        while cnt < n and temp.next:
            target.next = temp.next
            temp = temp.next
            target = target.next
            cnt += 1

        end = target.next
        target.next = None

        reversed_List = reverse_List(target_head)

        t = reversed_List
        while t.next:
            t = t.next
        t.next = end
        if not prev:
            return reversed_List

        else:
            prev.next = reversed_List

            return head

