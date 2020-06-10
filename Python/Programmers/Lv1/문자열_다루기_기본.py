def solution(s):
    length = len(s)
    return (length==4 or length==6) and s.isdigit()

print(solution('1234'))    

 