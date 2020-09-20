# class Solution(object):
#     def longestPalindrome(self, s):
#         size = len(s)
#         ans = ""
#         for i in range(size):
#             if len(ans)>len(s[i:]): break
#             for k in range(i+1,size+1):
#                 temp  = s[i:k]
#                 if temp == temp[::-1] and len(ans) < len(temp):
#                     ans = temp
#         return ans
class Solution(object):
    def longestPalindrome(self,s):

        def expand(s,left,right):
            print(left,right)
            while( left >= 0 and right<=len(s) and s[left]==s[right-1] ):
                left-=1
                right+=1
            print(s[left+1:right-1])
            print()
            return s[left+1:right-1]

        if len(s) < 2 or s==s[::-1]: return s
        res = ''
        for i in range(len(s)-1):
            res = max(expand(s,i,i+1),expand(s,i,i+2),res,key=len) # max구할때도 key를 넣어줄 수 있다.
        return res


    # def isPalindrom(self,s):

app = Solution()
s = "abbac"
print(app.longestPalindrome(s))