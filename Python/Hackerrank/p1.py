def balancedSum(arr):
    for i in range(len(arr)):
        if sum(arr[:i]) == sum(arr[i + 1:]):
            return i

arr =[1,2,3,3]
print(balancedSum(arr))
print('hi')