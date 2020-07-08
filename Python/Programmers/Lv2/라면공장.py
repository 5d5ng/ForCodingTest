# import copy
# def solution(stock,dates,supplies,k):
#   ans = 0
#   lst = []
#   temp = []
#   for d,s in zip(dates,supplies):
#     temp.append(d)
#     temp.append(s)
#     lst.append(copy.deepcopy(temp))
#     temp.clear()
#   lst.sort(key=lambda l: l[1],reverse=True)
#   flag = 0
#   print(lst)
#   while(k>flag) and len(lst)>0:
#     if stock >= lst[0][0]:
#       stock = (stock-lst[0][0])+lst[0][1]
#       flag+=lst[0][1]
#       ans+=1
#     lst.pop(0)
  
#   return ans



import heapq
def solution(stock,dates,supplies,k):
  ans = 0
  heapq._heapify_max(supplies)
  for i in range(len(stock)):
    


dates = [1,2,3,4]
supp = [10,40,20,30,1,5,2]
k  = 100
solution(stock,dates,supp,k)

l = []
l.append(dates)
l.append(supp)