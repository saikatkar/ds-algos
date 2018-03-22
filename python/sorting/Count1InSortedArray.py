"""
Given a binary array sorted in non-increasing order, count the number of 1’s in it.

Examples:

Input: arr[] = {1, 1, 0, 0, 0, 0, 0}
Output: 2

Input: arr[] = {1, 1, 1, 1, 1, 1, 1}
Output: 7

Input: arr[] = {0, 0, 0, 0, 0, 0, 0}
Output: 0

"""


def count1insortedarray(arr,low,high):


    if arr[0] == 0:
        return 0
    if arr[len(arr)-1] == 1:
        return len(arr)

    if low < high :

        mid = int(low + (high-low)/2)

        if arr[mid] == 1 and arr[mid+1] ==0 :

            return mid+1

        elif arr[mid] == 1 and arr[mid+1] ==1 :

            return count1insortedarray(arr,mid+2,high)

        elif arr[mid] == 0 and arr[mid-1] ==1 :

            return mid
        elif arr[mid] == 0 and arr[mid+1] == 0 :

            return count1insortedarray(arr,low,mid-1)







A = [0, 0, 0, 0, 0, 0, 0]

print(count1insortedarray(A,0,len(A)-1))