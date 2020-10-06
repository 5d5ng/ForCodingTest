from typing import List


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def mergeKLists(self, lists: List[ListNode]) -> ListNode:
        data = []
        for list in lists:
            while list:
                data.append(list.val)
                list = list.next
        data = sorted(data)
        root = temp = ListNode()
        for i in data:
            temp.next = ListNode(i)
            temp = temp.next
        return root.next

    def mergeKLists2(self,lists:List[ListNode])->ListNode:

        import heapq
        heap = []
        root = result = ListNode()

        #각 연결리스트의 루트를 힙에 저장
        for i in range(len(lists)):
            if lists[i]:
                heapq.heappush(heap,(lists[i].val,i,lists[i]))

        # 힙 추출 이후 다음 노드는 다시 저장
        while heap:
            node = heapq.heappop(heap)
            idx = node[1]
            result.next = node[2]

            result = result.next
            if result.next: # 다음노드가 None이 아닌경우
                heapq.heappush(heap,(result.next.val,idx,result.next))
        return root.next