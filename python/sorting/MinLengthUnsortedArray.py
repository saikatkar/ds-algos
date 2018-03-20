"""Find the Minimum length Unsorted Subarray, sorting which makes the complete array sorted
Given an unsorted array arr[0..n-1] of size n, find the minimum length subarray arr[s..e] such that sorting this subarray makes the whole array sorted.

Examples:
1) If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60], your program should be able to find that the subarray lies between the indexes 3 and 8.

2) If the input array is [0, 1, 15, 25, 6, 7, 30, 40, 50], your program should be able to find that the subarray lies between the indexes 2 and 5.

"""


def findminlengthsubarray(arr):
    s = 0
    for i in range(len(arr)):
        if arr[i] > arr[i+1]:
            s = i
            break
    e = len(arr) - 1
    while e > 0:
        if arr[e] < arr[e-1]:
            break
        e -= 1

    print(s)
    print(e)

    min_no = arr[s]
    max_no = arr[s]
    for i in range(s+1,e+1):
        if arr[i] > max_no:
            max_no = arr[i]

        if arr[i] < min_no:
            min_no = arr[i]

    print(min_no)
    print(max_no)

    for i in range(0,s):
        if arr[i] > min_no:
            s = i

    i = len(arr) - 1
    while i >= e + 1:
        if arr[i] < max_no:
            e = i
            break
        i -= 1

    print("Start index ",s)
    print("End index ",e)



A = [10, 12, 26, 30, 25, 40, 32, 31, 35, 50, 60]

findminlengthsubarray(A)
