# from itertools import combinations
# def solution(relation):
#     cnt = 0
#     size = len(relation)
#     attribute = []

#     items = [i for i in range(len(relation[0]))]
#     for pick in range(size):
#         target = list(combinations(items,pick+1)) #조합
#         # print(target)
#         for i in target:  #조합집합
#             for j in range(size): #행 순회
#                 val = ""
#                 for k in i: # 조합 인덱스만 뽑아서 더하기
#                     val+=relation[j][k]
#                 attribute.append(val)
#             if(len(attribute)==len(set(attribute))):
#                 cnt+=1
#                 for k in i:
#                     items.remove(k)
#             attribute.clear()
#     return cnt

        


# items = [1,2,3]
# print(items[:])
# # print(list(permutations(items,3)))

#다른 사람 풀이
from itertools import combinations
def solution(relation):
    def checkCandidate(colLst,rows): #후보키 인지 확인하는 함수
        tmp = [tuple([item[idx] for idx in colLst]) for item in relation]
        # print(tmp)
        if len(set(tmp)) != rows:
            return False
        else:
            return True
    rows = len(relation)
    cols = len(relation[0])
    colLst = range(cols)
    lst = []
    for leng in range(1,cols+1):
        comb = combinations(colLst,leng)
        for n1 in list(comb):
            if checkCandidate(n1,rows):
                lst.append(set(n1))

    for el1 in lst[:]: #최소성 검증
        for el2 in lst[:]:
            if el1 == el1 & el2:
                if el1 != el2:
                    # print(el2)
                    lst.remove(el2)
    return len(lst)

lst = [1,3,4]


t = [["100", "ryan", "music", "2"], ["200", "apeach", "math", "2"], ["300", "tube", "computer", "3"], ["400", "con", "computer", "4"], ["500", "muzi", "music", "3"], ["600", "apeach", "music", "2"]]
# t = [["1","2","3"],["2","2","4"]]
# print(type(range(10)))
# print((1,2)&(1))
print(solution(t))