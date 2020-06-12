def solution(phone_book):
    phone_book.sort()
    for i in range(len(phone_book)):
        for j in range(i+1,len(phone_book)):
            temp = phone_book[j].replace(phone_book[i],"T") 
            if(temp.find("T") > -1):
                 return False
    return True

lst = ["12","2333","1111","123","987","9"]
lst.sort(key=len)
lst.reverse()
print(lst)

#다른 풀이
def solution2(phoneBook):
    phoneBook = sorted(phoneBook)

    for p1, p2 in zip(phoneBook, phoneBook[1:]):
        if p2.startswith(p1):
            return False
    return True
