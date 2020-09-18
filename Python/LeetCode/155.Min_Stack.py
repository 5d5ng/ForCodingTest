class Minstack (object):
  def __init__(self):
    self.lst = []
  
  def push(self,x):
    self.lst.append(x)
  def pop(self):
    self.lst.pop()
  def top(self):
    return self.lst[-1]
  def getMin(self):
    return min(self.lst)