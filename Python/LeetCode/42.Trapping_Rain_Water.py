# from typing import List
# class Solution:
#     def trap(self,height:List[int])->int:
#         answer = 0
#         negative = False
#         positive = False
#         start = 0
#         for i in range(len(height)-1):
#             flag = height[i+1] - height[i]
#             if not negative and flag <0:
#                 start = i
#
#             if flag < 0:
#                 negative = True
#             if negative and flag > 0:
#                 positive = True
#
#             if (flag < 0 and positive)  :
#                 answer+= Solution.getwater(self,height[start:i+1])
#                 positive = False
#                 start = i
#             elif negative and positive and i==len(height)-2:
#                 answer += Solution.getwater(self,height[start:])
#         return answer
#
#     def getwater(self,lst):
#         # print(lst)
#         maxLeft = max(lst[:lst.index(min(lst))])
#         maxRight = max(lst[lst.index(min(lst))+1:])
#         maxH = min(maxRight,maxLeft)
#         for i,v in enumerate(lst):
#             if v > maxH:
#                 lst[i] = maxH
#         res = 0
#         for v in lst:
#             res+= (maxH-v)
#
#         return res


from typing import List
class Solution:
    def trap(self,height:List[int])->int:
        if not height : return 0

        volume = 0
        left, right  = 0,len(height)-1
        left_max , right_max = height[left] , height[right]

        while(left<right):
            left_max,right_max = max(height[left],left_max) , max(height[right],right_max) # 현재 포인터가 더 큰 값을 가지고 있다면 교

            if left_max <= right_max: # 왼쪽의 최대값이 더 작으면 왼쪽으로 오른쪽으로 한칸 이동
                volume += left_max-height[left]
                left+=1
            else:
                volume += right_max - height[right]
                right-=1
        return volume

    def trap2(self,height:List[int])->int:
        stack = []
        volume = 0

        for i in range(len(height)):

            while stack and height[i] > height[stack[-1]]: # 지금 순회하는 높이가 스택의 top보다 큰경
                print(stack)
                top = stack.pop()

                if not len(stack): break #스택이 빈 경우

                distance = i - stack[-1] -1  #

                water = min(height[i],height[stack[-1]]) - height[top]
                print(distance,water)
                volume += distance * water
            stack.append(i)

        return volume




app =Solution()
# test = [0,1,0,2,1,0,1,3,2,1,2,1]
test = [5,1,2,0,2,5]
print(app.trap2(test))
