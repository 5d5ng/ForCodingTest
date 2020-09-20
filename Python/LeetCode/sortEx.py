a = [2,5,1,9,7]

print(sorted(a))

b = 'zbdaf'
print(sorted(b))

print("".join(sorted(b)))


c = ['ccc','aaaa','d','db']

print(sorted(c,key=len))


a = ['cde','cfc','abc']

def fn(s):
    return s[0],s[-1]

print(sorted(a,key=fn))
print(sorted(a,key=lambda a:(a[0],a[-1])))
