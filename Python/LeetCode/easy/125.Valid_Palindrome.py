def isPalindrome(s):
    temp = ""
    for c in s:
        if c.isalnum():
            temp+=c.lower()

    return temp == temp[::-1]

s = "A man, a plan, a canal: Panama"
print(isPalindrome('0P'))