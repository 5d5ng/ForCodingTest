def solution(A):
  gap = []
  ans = 0
  for i in range(len(A)-1):
    gap.append(A[i+1]-A[i])
  lst = []
  prev = gap[0]
  cnt = 1
  for i in range(1,len(gap)):
    if prev ==gap[i]:
      cnt+=1
    if i==len(gap)-1:
      lst.append(cnt)
    elif prev!=gap[i]:
      lst.append(cnt)
      cnt = 1
      prev = gap[i]

  maxValue= max(lst)
  dp = [0,0,1]
  for i in range(3,maxValue+1):
    dp.append(i-1+dp[-1])
  for i in lst:
    ans+=dp[i]      
  return ans

  

lst = [-1,1,3,3,3,2,3,2,1,0]
print(solution(lst))
# print(max(lst))
a = max(lst)
print(a)
# print(a)