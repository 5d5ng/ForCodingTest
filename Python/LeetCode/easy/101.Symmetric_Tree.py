# # Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

    def isSymmetric(self, root):
      q = []
      q.append(root)
      q.append(root)
      while q:
        t1 = q.pop()
        t2 = q.pop()
        if t1 == null and t2 ==null:
          continue
        if t1 == null or t2 == null:
          return False
        if t1.val != t2.val:
          return False
        q.append(t1.left)
        q.append(t2.right)
        q.append(t1.right)
        q.append(t2.left)

      return True


