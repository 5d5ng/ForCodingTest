class ListNode:
    def __init__(self,val = 0,next = None):
        self.val= val
        self.next = next

class Solution:
    def OddEvenList(self,head: ListNode)-> ListNode:
        temp = head
        head_odd = odd = ListNode()
        head_even = even = ListNode()

        cnt = 0
        while temp:
            if cnt%2 == 0 :
                odd.next = temp
                odd = odd.next
            else:
                even.next = temp
                even = even.next
            cnt+=1
            temp = temp.next

        even.next = None
        odd.next = head_even.next

        return head_odd.next

    def OddEvenList2(self,head: ListNode)-> ListNode:
        if head is None:
            return None
        odd = head
        even = head.next
        even_head = head.next

        while even and even.next:
            odd.next, even.next = odd.next.next, even.next.next
            odd, even = odd.next, even.next

        odd.next = even_head

        return head





