def solution(n, a, b):
    res = 0
    while(a!=b):
      if a%2 == 1: a+=1
      if b%2 == 1: b+=1
      a/=2
      b/=2
      res+=1
    return res


print(solution(8, 6, 5))
