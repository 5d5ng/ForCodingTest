def isPrime(num):
  for i in range(3,num):
    if num%i==0:
      return False
  return True

def solution(nums):
  size = len(nums)
  ans = 0
  for i in range(size-2):
    for j in range(i+1,size-1):
      for k in range(j+1,size):
        target = nums[i]+nums[j]+nums[k]
        if isPrime(target):
          ans+=1
  return ans

t = [1,2,3,4]
from itertools import combinations as cb
for i in cb(t,3):
  print(i)

a = solution(t)
# print(a)