def solution(nums):
  set_nums = set(nums)
  if len(set_nums) >= len(nums)/2:
    return int(len(nums)/2)
  else:
    return int(len(set_nums))

def solution(nums):
  return min(len(set(nums)) , len(nums)/2)

lst = [1,2,3,1]
ans = solution(lst)
print(ans)