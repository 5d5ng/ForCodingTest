def solution(A):
  st = list(set(list(A)))
  st.sort()
  lLst = []
  uLst = []
  lst = []

  for i in range(len(st)):
    if st[i].islower():
      uLst = st[:i]
      lLst = st[i:]
      break
  if len(uLst)>0 and len(uLst)==len(lLst):
    return len(A)


  for i in uLst:
    for j in lLst:
      if i==j.upper():
        lst.append(i)
  
  if len(lst) ==0 :
    return -1
  ans = -1
  cnt = 0
  A = A.upper()

  for i in range(len(A)):
    if A[i] in lst:
      cnt+=1
    else:
      ans = max(cnt,ans)
      cnt = 0
    if i == len(A)-1:
      ans = max(cnt,ans)
  
  if ans == 1:
    return -1
  else:
    return ans


      


  print(lst)
        

  
  


s = 'azABaabza'
s2 = 'TacoCat'


a =  solution(s)
print(a)

