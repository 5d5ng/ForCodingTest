def solution (brown,yellow):
    total = brown + yellow
    for i in range(1,total): #세로길이
        temp = int(total/i)
        if total%i == 0:
            if 2*(i+temp) - 4 == brown:
                return [temp , i]

res = solution(8,1)
print(res)
