class Solution(object):
    def mostCommonWord(self,paragraph,banned):
        word = []
        paragraph = paragraph.lower()
        paragraph+=" "
        idx = 0
        for i in range(len(paragraph)-1):

            if paragraph[i].isalpha() and  not paragraph[i+1].isalpha():
                word.append(paragraph[idx:i+1])
            elif not paragraph[i].isalpha() and paragraph[i+1].isalpha():
                idx = i+1

        
        dic = {}
        for w in word:
            if w not in banned:
                if dic.get(w) is None:
                    dic[w] = 1
                else:
                    dic[w]+=1
        
        frq = 0
        ans = ""
        for key,val in dic.items():
            if frq < val:
                frq = val
                ans = key

        return ans



app = Solution()
banned = ['a']
paragraph = "a, a, a, a, b,b,b,c, c"

print(app.mostCommonWord(paragraph,banned))