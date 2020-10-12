from typing import List


class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits: return []
        num = {2: "abc", 3: "def", 4: "ghi", 5: "jkl", 6: "mno", 7: "pqrs", 8: "tuv", 9: "wxyz"}
        lst = []
        for digit in digits:
            lst.append(num[int(digit)])

        global res
        temp = []

        def comb(lst, depth, res):
            if depth == len(lst):
                temp.append(res)
                return res
            for i in lst[depth]:
                comb(lst, depth + 1, res + i)

        comb(lst, 0, "")
        return temp