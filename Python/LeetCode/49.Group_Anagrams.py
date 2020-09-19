import collections
class Solution(object):

    def groupAnagrams(self, strs):
        anagrams = collections.defaultdict(list)

        for word in strs:
            anagrams[''.join(sorted(word))].append(word)

        print(anagrams)
        return anagrams.values()


# 내 풀이
# class Solution(object):
#     def groupAnagrams(self, strs):
#         size = len(strs)
#         if size<=1 :
#             return [strs]
#
#         dicList = []
#         for s in strs:
#             temp = {}
#             for c in s:
#                 if c in temp:
#                     temp[c] +=1
#                 else:
#                     temp[c] = 1
#             dicList.append(temp)
#         ans = []
#         for i in range(size-1):
#             temp = [i]
#             if len(dicList[i])>0:
#                 for j in range(i+1,size):
#                     if len(dicList[j]) >0 and dicList[i] == dicList[j]:
#                         temp.append(j)
#                         dicList[j].clear()
#                 dicList[i].clear()
#                 sList = []
#                 for num in temp:
#                     sList.append(strs[num])
#                 if not sList in ans:
#                     ans.append(sList)
#
#         for i,v in enumerate(dicList):
#             if len(v)>0:
#                 temp = []
#                 temp.append(strs[i])
#                 ans.append(temp)
#
#         cnt = strs.count("")
#         if cnt>0:
#             lst = []
#             for i in range(cnt):
#                 lst.append("")
#             ans.append(lst)
#         return ans
#
app = Solution()
strs = ["eat","tea","tan","ate","nat","bat"]
print(app.groupAnagrams(strs))
