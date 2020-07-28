import math
def solution(n,words):
  used = [words[0]]
  for i in range(1,len(words)):
    if ( words[i-1][-1] != words[i][0]) or (words[i] in used):
      return [(i%n)+1,math.ceil((i+1)/n)]
    used.append(words[i])
  return [0,0]

  

words = ["land", "dream", "mom", "mom", "ror", "world"]
print(solution(2,words))
