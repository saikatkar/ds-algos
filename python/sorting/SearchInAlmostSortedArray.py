"""
    Given an array which is sorted, but after sorting some elements are moved to either of the adjacent positions, i.e., arr[i] may be present at arr[i+1] or arr[i-1]. Write an efficient function to search an element in this array. Basically the element arr[i] can only be swapped with either arr[i+1] or arr[i-1].

For example consider the array {2, 3, 10, 4, 40}, 4 is moved to next position and 10 is moved to previous position.

Example:

Input: arr[] =  {10, 3, 40, 20, 50, 80, 70}, key = 40
Output: 2
Output is index of 40 in given array

Input: arr[] =  {10, 3, 40, 20, 50, 80, 70}, key = 90
Output: -1
-1 is returned to indicate element is not present
"""

def searchinalmostsortedarray(arr,low,high,key):

    if low < high :

        mid = int(low + (high - low)/2)

        if arr[mid] == key :
            return mid
        if mid > low and arr[mid-1] == key :
            return mid-1
        if mid < high and arr[mid+1] == key :
            return mid+1


        if arr[mid] > key :
           return searchinalmostsortedarray(arr,low,mid-1,key)
        else:
           return searchinalmostsortedarray(arr,mid+1,high,key)


    return -1


A = [10, 3, 40, 20, 50, 80, 70]

print(searchinalmostsortedarray(A,0,len(A)-1,90))