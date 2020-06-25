def solution(n):
    lst = [0,1]
    for i in range(n):
        lst.append((lst[-1]+lst[-2])%1234567)
    return lst[n]


def fibonacci(num):
    a,b = 0,1
    for i in range(num):
        a,b = b,a+b
    return a

print(solution(5))