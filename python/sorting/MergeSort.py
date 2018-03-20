A = [64, 25, 12, 22, 11,8,23]

def merge(arr,l,h,mid):

    n1 = mid - l+1
    n2 = h - mid

    L = [0]*n1
    R = [0]*n2

    for i in range(n1):
        L[i] = arr[l+i]
    for i in range(n2):
        R[i] = arr[mid+i+1]

    i,j,k = 0,0,l
    while i < n1 and j < n2:
        if L[i] <= R[j]:
            arr[k] = L[i]
            i += 1
        else:
            arr[k] = R[j]
            j += 1
        k += 1

    while i < n1:
        arr[k] = L[i]
        i += 1
        k += 1

    while j < n2:
        arr[k] = R[j]
        j += 1
        k += 1

def mergesort(arr, low, high):

    
    if low < high:

        mid = int((low+high)/2)

        mergesort(arr,low,mid)
        mergesort(arr,mid+1,high)
        merge(arr,low,high,mid)

mergesort(A,0,len(A)-1)

print(A)