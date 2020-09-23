from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        product = 1
        for i in nums:
            if i != 0:
                product *= i
        count_zero = nums.count(0)
        for i, val in enumerate(nums):
            if count_zero > 1:
                nums[i] = 0
            elif count_zero == 1 and val == 0:
                nums[i] = product
            elif count_zero == 1 and val != 0:
                nums[i] = 0
            else:
                nums[i] = product // val

        return nums

    def productExceptSelf2(self, nums: List[int]) -> List[int]:
        out = []
        p = 1
        for i in range(len(nums)):
            out.append(p)
            p *= nums[i]
        p = 1
        print(out)
        for i in range(len(nums) - 1, -1, -1):
            out[i] *= p
            p *= nums[i]
        return out


t = [1, 2,3,4]
print(Solution.productExceptSelf2(None, t))
