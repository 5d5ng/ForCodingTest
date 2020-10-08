from copy import deepcopy

class Solution:
    def lengthOfLongestSubstring(self,s:str) -> int:
        used = {}
        start = max_len = 0

        for i,val in s:
            if val in used and start <= used[val]:
                start = used[val] + 1
            else:
                max_len = max(max_len,i - start +1)

            used[val] = i
        return max_len


app = Solution()
s ="aabaab!bb"
# print(s)
print(app.lengthOfLongestSubstring(s))

