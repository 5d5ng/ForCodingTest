def solution(arr1, arr2):
    answer = []
    for i in range(len(arr1)):
        lst = []
        for k in range(len(arr2[0])):
            temp = 0
            for j in range(len(arr1[0])):
                temp += arr1[i][j]*arr2[j][k]
            lst.append(temp)
        answer.append(lst)
    return answer

ar1 = [[1,4],[3,2],[4,1]]
ar2 = [[3,3],[3,3]]
# a = solution(ar1,ar2)
# print(a)



def productMatrix(A, B):
    return [[sum(a*b for a, b in zip(A_row,B_col)) for B_col in zip(*B)] for A_row in A]

def solution2(A,B):
    ans =[]
    for A_row in A:
        lst = []
        for B_row in zip(*B):
            print(B_row)
            
            temp =  sum (a*b for a,b in zip(A_row,B_row) )
            lst.append(temp)
        ans.append(lst)
    return ans

an  = solution2(ar1,ar2)
print(an)        
