class Solution(object):
    def singleNumber(self, nums):
      nums.sort()
      for i in range(0,len(nums)-1,2):
        if(nums[i]!=nums[i+1]):
          return nums[i]
      return nums[-1]

            
      
lst = [1,1,2,2,4]
c1 = Solution()
print(c1.singleNumber(lst))
