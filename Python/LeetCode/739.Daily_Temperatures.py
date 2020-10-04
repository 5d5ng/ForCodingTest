from typing import List


class Solution:
    def dailyTemperatures(self,T:List[int])->List[int]:
        ans = [0 for i in range(len(T))]
        stack = []
        for i,cur in enumerate(T):
            while stack and T[stack[-1]] < cur:
                idx = stack.pop()
                ans[idx] = i - idx
            stack.append(i)
        return ans

    def dailyTemperatures2(self, T: List[int]) -> List[int]: # 브루트 포스
        ans = []
        for i in range(len(T) - 1):
            cnt = 0

            for j in range(i + 1, len(T)):
                if T[i] < T[j]:
                    cnt += 1
                    ans.append(cnt)
                    break
                else:
                    cnt += 1
            else:
                ans.append(0)
        ans.append(0)
        return ans


app = Solution()
t = [73, 74, 75, 71, 69, 72, 76, 73]
print(app.dailyTemperatures(t))
print('he')
