A = [64, 25, 12, 22, 11,8,23,45,36]


def partition(arr,low,high):

    pivot = arr[high]
    i = low-1
    for j in range(low,high):

        if arr[j] <= pivot:
            i += 1
            arr[i],arr[j] = arr[j],arr[i]

    arr[i+1],arr[high] = arr[high],arr[i+1]

    return i+1




def quicksort(arr, low, high):

    if low < high:

        pivot = partition(arr,low,high)

        quicksort(arr,low,pivot-1)
        quicksort(arr,pivot+1,high)



quicksort(A, 0, len(A)-1)

print(A)