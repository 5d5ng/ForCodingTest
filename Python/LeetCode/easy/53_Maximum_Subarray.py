class Solution(object):
    def maxSubArray(self, nums):
        n = len(nums)
        dp = [0 for i in range(n)]
        dp[0] = nums[0]
        res = dp[0]
        for i in range(1,n):
          if dp[i-1] > 0:
            dp[i] = nums[i] + dp[i-1]
          else:
            dp[i] = nums[i]
          res = max(res,dp[i])
        return res


    def maxSubArray2(self,nums):
      max_sum = nums[0]
      temp_sum = nums[0]
      for index in range(1,len(nums)):
        temp_sum += nums[index]
        if nums[index]> temp_sum:
          temp_sum = nums[index]
        if temp_sum > max_sum:
          max_sum = temp_sum
      return max_sum

app = Solution()
lst = [-2,1,-3,4,-1,2,1,-5,4]
print(app.maxSubArray(lst))
