# import re
# def solution(expression):
#   answer = 0
#   rule = ['*+-','*-+','+*-','+-*','-*+','-+*'] # 가능한 모든 우선순위 경우의 수
#   nums = re.findall("\d+",expression)
#   exp = re.findall("\*|\+|-",expression)
#   newE = []
#   for i in range(len(exp)):
#     newE.append(nums[i])
#     newE.append(exp[i])
#   newE.append(nums[-1])
#   for r in rule:
#     temp = newE
#     for e in r:
#       i = 0
#       while temp.count(e)>0:
#         if ! temp[i].isdigit():
#           if(temp[i]=="*"):
            

      

      



  


    
  # for r in rule:

import re
ex = "100-200*300-500+20"
nums =re.split(r"-|\*|\+" ,ex)
exp = re.findall("[0-9]+",ex) # 숫자이어지게 추출
ee = re.findall("\d",ex)# 한자리씩 추출
ee = re.findall("- | \* | \+ " ,ex)  
# print(ee)

print(ex.index("0"))