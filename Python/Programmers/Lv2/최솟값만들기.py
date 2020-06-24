
def solution(A,B):
    ans = 0
    A.sort()
    B.sort()
    B.reverse()
    for i,j in zip(A,B):
        ans+=(i*j)
    return ans


arr = [1,2,3]
arr2  = [2,3,4]
arr2.sort()
arr2.reverse()
print(arr2)

print(solution(arr,arr2))
# 
import itertools 
lst = list(itertools.permutations(arr,2))
print(lst)

