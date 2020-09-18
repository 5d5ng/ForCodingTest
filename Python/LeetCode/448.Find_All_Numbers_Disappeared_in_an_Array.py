class Solution(object):
  def findDisappearedNumbers(self,nums):
    size = len(nums)
    lst = [i for i in range(0,size+1)]
    
    for i in nums:
      lst[nums[i]]+=1
    res = []
    for i in range(1,size+1):
      if lst[i]==0:
        res.append(i)
    return res
    