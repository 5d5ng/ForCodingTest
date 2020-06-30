def solution(n):
  temp = n
  cnt = str(bin(n)).count("1")
  while True:
    temp+=1
    if str(bin(temp)).count("1") == cnt:
      return temp
     





    
  