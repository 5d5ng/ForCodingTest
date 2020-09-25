# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        if not l1 or (l2 and l1.val > l2.val):
            l1 , l2 = l2, l1
        if l1:
            l1.next = self.mergeTwoLists(l1.next,l2)
        return l1

    def mergeTwoLists2(self, l1: ListNode, l2: ListNode) -> ListNode:
        if not l1 and not l2:
            return None

        head = temp = ListNode()
        while l1 and l2:
            if l1.val <= l2.val:
                temp.next = l1
                l1 = l1.next
            else:
                temp.next = l2
                l2 = l2.next
            temp = temp.next

        if l1 or l2:
            temp.next = l1 or l2

        return head.next

class Student:
    def __init__(self,name=0,num=1):
        self.name = name
        self.num = num
s1 = Student()
s2 = Student('sdg')
s3 = Student(num='g')

print(s1,s2,s3)
l1 = ListNode(val=3)
l2 = ListNode(val=3)
app = Solution()
print(app.mergeTwoLists(l1,l2))


