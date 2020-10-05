import collections


class Solution:
    def removeDuplicateLetters(self, s: str) -> str:
        for char in sorted(set(s)): # set을 sorted하면 정렬된 리스트로 자동 변환된다.
            suffix = s[s.index(char):]
            if set(s) == set(suffix):
                return char + self.removeDuplicateLetters(suffix.replace(char, ''))
        return ''

    def removeDuplicateLetters2(self, s: str) -> str:
        counter = collections.Counter(s)
        seen = set()
        stack  = []

        for char in s:
            counter[char] -= 1
            if char in seen:
                continue

            while stack and char < stack[-1] and counter[stack[-1]] > 0:
                seen.remove(stack.pop())
            stack.append(char)
            seen.add(char)
        return ''.join(stack)



lst = [1, 2, 1, 2]
print(lst.index(2, -1))
s = 'dewgd'
print(type(sorted(set(list(s)))))

