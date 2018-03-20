A = [2,4,1,5,1,8,2,5,4,9]

def countsort(arr):

    ans = [0]*len(arr)
    count = [0]*10

    for i in range(len(arr)):
        count[arr[i]] += 1

    for i in range(1,len(count)):
        count[i] += count[i-1]

    for i in range(len(arr)):
        ans[count[arr[i]]-1] = arr[i]
        count[arr[i]] -= 1

    return ans


output = countsort(A)

print(output)