class Solution(object):
    def mergeTrees(self, t1, t2):
        if(t1 is None): return t2
        elif(t2 is None): return t1
        t1.val+=t2.val
        t1.left = self.mergeTrees(t1.left,t2.left)
        t1.right = self.mergeTrees(t1.right,t2.right)
        return t1

# 다른사람 풀이
# class Solution(object):
#     def mergeTrees(self, t1, t2):
#         if t1 and t2:
#             t1.val +=t2.vak
#             t1.left = self.mergeTrees(t1.left,t2.left)
#             t1.right = self.mergeTrees(t1.right,t2.right)
#         else:
#             t1 = t1 or t2
#         return t1
