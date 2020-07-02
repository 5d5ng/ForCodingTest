import re
import copy
def solution(expression):
  answer = 0
  rule = ['*+-','*-+','+*-','+-*','-*+','-+*'] # 가능한 모든 우선순위 경우의 수
  nums = re.findall("\d+",expression)
  nums = list(map(int,nums))
  exp = re.findall("\*|\+|-",expression)

  lst = []
  ans = 0
  for r in rule:
    tempnums = copy.deepcopy(nums)
    tempexp = copy.deepcopy(exp)
    
    for i in r:
      while i in tempexp:
        idx = tempexp.index(i)
        tempexp.pop(idx)
        temp = 1
        if idx >=0:
          if i == "*":
            temp = tempnums.pop(idx)*tempnums.pop(idx)
          elif i == "-":
            temp = tempnums.pop(idx)-tempnums.pop(idx)
          else:
            temp = tempnums.pop(idx)+tempnums.pop(idx)
        tempnums.insert(idx,temp)
        if(len(tempnums)==1):
          ans = max(abs(tempnums[0]),ans)    
  return ans
     

print(solution(ex))
