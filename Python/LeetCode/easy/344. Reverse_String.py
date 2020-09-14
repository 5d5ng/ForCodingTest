class Solution(object):
    def reverseString(self, s):
        for i in range(int(len(s)/2)):
            temp = s[i]
            s[i] = s[-(i+1)]
            s[-(i+1)] = temp
        



lst = ["h","e","l","l","o"]
app = Solution()
print(lst)
app.reverseString(lst)
print(lst)
