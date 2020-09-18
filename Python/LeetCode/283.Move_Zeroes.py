class Solution1(object):
    def moveZeroes(self, nums):
        cntz = nums.count(0)
        l = len(nums)
        for i in range(l):
            if nums[i]!=0:
                nums.append(nums[i])
        for i in range(cntz):
            nums.append(0)
        nums = nums[l:]
        return nums


class Solution2(object):
    def moveZeroes(self, nums):
      cntz = nums.count(0)
      i = 0
      j = 0
      while(j<cntz):
        if nums[i] == 0:
          nums.pop(i)
          i-=1
          j+=1
          nums.append(0)
        i+=1
      return nums

class Solution3:
    def moveZeroes(self, nums: List[int]) -> None:
        cntZ = nums.count(0)
        for i in range(cntZ):
            nums.remove(0)
            nums.append(0)

ap = Solution3()
ls = [0,1,0,3,12]
print(ap.moveZeroes(ls))
        