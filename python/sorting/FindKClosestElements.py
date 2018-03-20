"""Find k closest elements to a given value
Given a sorted array arr[] and a value X, find the k closest elements to X in arr[].
Examples:

Input: K = 4, X = 35
       arr[] = {12, 16, 22, 30, 35, 39, 42,
               45, 48, 50, 53, 55, 56}
Output: 30 39 42 45

Note that if the element is present in array, then it should not be in output, only the other closest elements are required.
"""


def findkclosest(arr,x,k):

    n = len(arr)
    l = findcrossover(arr,0,len(arr)-1,x)
    r= l + 1
    if arr[l] == x :
        l -= 1
    count = 0

    while l >= 0 and r <= n-1 and count < k :

        if x - arr[l] > arr[r] - x:
            print(arr[r])
            r += 1
        else:
            print(arr[l])
            l -= 1

        count += 1

    while l >= 0 and count < k:
        print(arr[l])
        l -= 1
        count += 1
    while r <= n-2 and count < k:
        print(arr[r])
        r += 1
        count += 1

"""Function to find the cross over point (the point before
   which elements are smaller than or equal to x and after
   which greater than x)"""

def findcrossover(arr,low,high,x):


    if arr[high] <= x :
        return high

    if arr[low] > x :
        return low

    mid = int(low + (high - low)/2)

    if arr[mid] <= x and arr[mid+1] > x :
        return mid

    if arr[mid] < x :
        return findcrossover(arr,mid+1,high,x)
    else :
        return findcrossover(arr,low,mid-1,x)


A = [12, 16, 22, 30, 35, 39, 42,45, 48, 50, 53, 55, 56]

findkclosest(A,41,4)