def solution(n):
    lst = [0,1]
    for i in range(n):
        lst.append((lst[-1]+lst[-2])%1234567)

    return lst[n]


print(solution(5))