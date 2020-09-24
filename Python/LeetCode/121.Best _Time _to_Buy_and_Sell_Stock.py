from typing import List
import sys

class Solution:
    def maxProfit(self,prices:List[int])-> int:
        if len(prices) == 0: return 0
        ans = 0
        minProfit = max(prices)+1
        for i in range(len(prices)):
            if minProfit > prices[i]:
                minProfit = prices[i]
            elif ans < prices[i] - minProfit:
                ans = prices[i] - minProfit
        return ans

    def maxProfit2(self,prices:List[int])-> int:
        profit = 0
        min_price = sys.maxsize

        for price in prices:
            min_price = min(min_price,price)
            profit = max(profit,price - min_price)
        return profit




app = Solution()
test = [7,6,4,3,1]
print(app.maxProfit(test))

