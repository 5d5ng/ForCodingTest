T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    N = int(input())
    lst = list(map(int,input().split()))
    avg = sum(lst)/len(lst)
    res = 0
    for num in lst:
        if num <= avg:
            res +=1
    print("#{} {}".format(test_case,res))



l = [1,2,3]
print(sum(l))