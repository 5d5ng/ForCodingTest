class Solution(object):
  def maxSubArray(self,nums):
    lst = []
    dp = [[0 for i in range(len(nums)+1)] for i in range(len(nums)+1) ]
    for i in range(1,len(nums)+1):
      
      # print(i)
      for j in range(i,len(nums)+1):
        dp[i][j] = dp[i][j-1]+nums[j-1]
      lst.append(max(dp[i]))
    return max(lst)
    



app = Solution();
lst = [-2,1,-3,4,-1,2,1,-5,4]
app.maxSubArray(lst)



