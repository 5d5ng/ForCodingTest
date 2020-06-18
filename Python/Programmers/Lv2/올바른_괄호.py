def solution(s):
    lst = []
    for i in s:
        if i == ')':
            if len(lst) ==0:
                return False
            else: 
                lst.pop()
        else:
            lst.append(i)
    return len(lst)==0