def solution(arr):
  arr.sort()
  answer = 1
  div = []
  num = 2; flag = False
  while num<=100:
    for i in range(len(arr)):
      if arr[i]%num == 0 :
        arr[i] /=num
        flag = True
    if flag == True: # 한번이라도 나눴다면 추가
      flag = False
      div.append(num)
      num = 2
    else:
      num+=1
  for i in arr:
    answer*=i
  for i in div:
    answer*=i
  return int(answer)



ar = [4,1,12,3]
print(solution(ar))

#다른 풀이
import math

def nlcm(num):      
    answer = num[0]
    for n in num:
        answer = n * answer / math.gcd(n, answer)
  
    return answer

