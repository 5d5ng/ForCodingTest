from typing import List
class Solution:
    def threeSum(self,nums: List[int]) ->List[List[int]]:
        ans = []
        nums.sort()
        for i in range(len(nums)-2):

            if i>0 and nums[i] == nums[i-1]: #동일숫자 생략
                continue

            left,right = i+1,len(nums)-1 # 선택한 숫자를 제외한 부분 양 끝에 투포인터 설정

            while left<right:
                target = nums[left] + nums[right] + nums[i]
                if target < 0:
                    left+=1
                elif target >0 :
                    right-=1
                else:
                    ans.append([nums[i],nums[left],nums[right]])
                    while left<right and nums[left] == nums[left+1]: #동일숫자 생략
                        left+=1
                    while left<right and nums[right] == nums[right-1]: #동일숫자 생략
                        right-=1
                    #left,right값이 같은 경우 방지 + 이미 사용된 인덱스이므로 다음차례로 넘김
                    left+=1
                    right-=1

        return ans

test =[-4,-1,-1,0,1,1,1,1,2]
a = {1}



print(Solution.threeSum(None,test))
print([-1,0]==[0,-1])