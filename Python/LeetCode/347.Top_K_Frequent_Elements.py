import collections
import heapq
from typing import List
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dic = collections.Counter(nums)
        res = list(dic.items())
        res = sorted(res,key=lambda a:(-a[1]))
        res = [i[0] for i in res ]
        return res[:k]

    def topKFrequent2(self,nums: List[int],k:int) -> List[int]:
        freqs = collections.Counter(nums)
        freqs_heap = []

        for f in freqs:
            heapq.heappush(freqs_heap,(-freqs[f],f))

        topk = list()

        for _ in range(k):
            topk.append(heapq.heappop(freqs_heap[1]))
        return topk

    def topKFrequent3(self,num,k):
        return list(zip(*collections.Counter(nums).most_common(k)))[0]



app = Solution()
nums = [1,1,1,1,2,2,2,2,2,3]
nums = [3,0,1,0]
# print(app.topKFrequent(nums, 1))

fruits = ['lemon','pear','watermelon','tomato']
print(fruits)
print(*fruits)
a,*b = [1,2,3,4]
print(a)
print(b)