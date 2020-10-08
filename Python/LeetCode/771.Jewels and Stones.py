import collections


class Solution:
    def numJewelsInStones(self,J:str,S:str)->int:
        dic = {}
        cnt = 0
        for j in J:
            dic[j] = 1
        for s in S:
            if dic.get(s):
                cnt+=1
        return cnt

    def numJewelsInStones2(self,J:str,S:str)->int:
        freqs = collections.Counter(S)
        cnt = 0
        for char in J:
            cnt += freqs[char]
        return cnt

    def numJewelsInStones3(self,J:str,S:str)->int:
        return sum(s in J for s in S)

app =Solution()

print(app.numJewelsInStones3("aA", "aAAbbbb"))
