from typing import List

class Solution:
    def twoSum(self,nums: List[int],target: int)-> List[int]:
        size = len(nums)
        for i in range(size-1):
            for j in range(i+1,size):
                if nums[i]+nums[j] == target:
                    return [i,j]
    def twoSum2(self,nums: List[int],target: int)-> List[int]:
        for i,n in enumerate(nums):
            complement = target - n

            if complement in  nums[i+1:]:
                return nums.index(n),nums[i+1:].index(complement) + (i+1)
    def twoSum3(self,nums:List[int],target:int)-> List[int]:
        nums_map = {}

        for i,num in enumerate(nums):
            nums_map [num] = i
        for i,num in enumerate(nums):
            if target - num in nums_map and i != nums_map[target-num]:
                return nums.index(num),nums_map[target-num]

    def twoSum4(self,nums:List[int],target: int)-> List[int]:
        nums_map = {}
        for i, num in enumerate(nums):
            if target-num in nums_map:
                return [nums_map[target-num],i]
            nums_map[num] = i

    def twoSum5(self,nums:List[int],target:int)->List[int]:
        left,right = 0 , len(nums)-1
        while not left == right:
            if nums[left] + nums[right] < target:
                left+=1
            elif nums[left] + nums[right] > target:
                right-=1
            else:
                return left,right


ap = Solution()
