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

l = {}

def solution3(phone_book):
    hash_map = {}
    for phone_number in phone_book:
        hash_map[phone_number] = 1
    for phone_number in phone_book:
        temp =""
        for number in phone_number:
            temp+=number
            if(temp in hash_map and temp!=phone_number):
                return  False
    return True