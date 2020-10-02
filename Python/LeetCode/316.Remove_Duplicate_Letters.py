class Solution:
    def removeDuplicateLetters(self,s:str)->str:
        lst = []
        for c in s:
            if c in lst:
                continue
            else:
                lst.append(c)

lst = [1,2,1,2]
print(lst.index(2,-1))
