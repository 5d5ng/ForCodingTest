n = int(input())
lst = []
cnt = 1
stack = []
flag = True
for i in range(n):
    num = int(input())
    while cnt <= num:
      stack.append(cnt)
      lst.append('+')
      cnt += 1
    if stack[-1] == num:
        stack.pop()
        lst.append('-')
    else:
        flag = False
if flag:
    for i in lst:
        print(i)
else:
    print('NO')


