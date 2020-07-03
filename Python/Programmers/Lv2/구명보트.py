#구명 보트를 최대한 적게 사용하여 구출
#
def solution(people,limit):
  people.sort()
  cnt = 0
  i = 0
  j = len(people)-1
  while i<=j:
    cnt+=1
    if people[i] + people[j] <=limit:
      i+=1
    j-=1
  return cnt
      
p = [50,60,40,40]
print(p is None)
print ( not p)
a = solution(p,100)
print(a)
      
  