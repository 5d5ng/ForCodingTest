from typing import List


class Solution:
    def arrayPairSum(self,nums:List[int])-> int:
        nums.sort()

        return sum(nums[::2])

input = [1, 4, 3, 2]
app = Solution()
print(app.arrayPairSum(input))
