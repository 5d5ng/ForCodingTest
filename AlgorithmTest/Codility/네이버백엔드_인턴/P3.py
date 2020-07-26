

def solution(A):
  A = str(A)
  ans =''
  
  if int(A)>=0: #양수일 떄
    flag = len(A)
    for i in range(len(A)):
      if A[i]<'5':
        flag = i
        break
    ans = A[:flag]+'5'+A[flag:]
  else:
    A=A[1:]
    for i in range(len(A)):
      flag = 0
      if A[i]>'5':
        flag = i
        break
    ans = '-'+A[:flag]+'5'+A[flag:]
  return int(ans)

print(solution(-999))

    