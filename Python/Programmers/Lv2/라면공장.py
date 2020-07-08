
# 최대 힙 만들기
  # for i in supplies:
  #   heapq.heappush(heap,(-i,i))
  # print(heapq.heappop(heap)[1])

import heapq
def solution(stock,dates,supplies,k):
  answer = 0
  heap = []
  start = 0
  while stock<k:
    for i in range(start,len(dates)):
      if dates[i] <= stock:
        heapq.heappush(heap,(-supplies[i],supplies[i]))
        start+=1
      else:
        break
    stock+=heapq.heappop(heap)[1]
    answer+=1
  return answer


    

stock = 4
dates = [1,2,3,4]
supp = [10,40,20,30]
k  = 100
solution(stock,dates,supp,k)

l = []
l.append(dates)
l.append(supp)