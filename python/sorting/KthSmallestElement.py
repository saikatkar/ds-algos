"""
K’th Smallest/Largest Element in Unsorted Array | Set 2 (Expected Linear Time)
We recommend to read following post as a prerequisite of this post.

K’th Smallest/Largest Element in Unsorted Array | Set 1

Given an array and a number k where k is smaller than size of array, we need to find the k’th smallest element in
the given array. It is given that ll array elements are distinct.

Examples:

Input: arr[] = {7, 10, 4, 3, 20, 15}
       k = 3
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15}
       k = 4
Output: 10
"""

def findkthsmallestelement(arr,low,high,k):

    if low <= high :

        pivot = partition(arr,low,high)

        if pivot == k-1 :
            return arr[k-1]
        elif pivot > k-1:
            return  findkthsmallestelement(arr,low,pivot-1,k)
        else:
            return findkthsmallestelement(arr,pivot+1,high,k)



def partition(arr,low,high):

    i = low-1
    pivot = arr[high]

    for j in range(low,high):
        if arr[j] < pivot:

            i += 1
            arr[j],arr[i] = arr[i] , arr[j]

    arr[i+1],arr[high] = arr[high],arr[i+1]

    return i+1

A = [7, 10, 4, 3, 20, 15]

print(findkthsmallestelement(A,0,len(A)-1,4))