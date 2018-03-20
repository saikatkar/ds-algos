"""
Find the closest pair from two sorted arrays
Given two sorted arrays and a number x, find the pair whose sum is closest to x and the pair has an element from each array.

We are given two arrays ar1[0…m-1] and ar2[0..n-1] and a number x,
we need to find the pair ar1[i] + ar2[j] such that absolute value of (ar1[i] + ar2[j] – x) is minimum.

Example:

Input:  ar1[] = {1, 4, 5, 7};
        ar2[] = {10, 20, 30, 40};
        x = 32
Output:  1 and 30

Input:  ar1[] = {1, 4, 5, 7};
        ar2[] = {10, 20, 30, 40};
        x = 50
Output:  7 and 40
"""
import  sys

def findtheclosestpair(arr1,arr2,x):

    l, final_l = 0, 0
    r, final_r = len(arr2)-1, len(arr2)-1
    diff = sys.maxsize

    while l < len(arr1) and r > 0 :
        if abs(arr1[l] + arr2[r] - x) < diff :
            diff = abs(arr1[l] + arr2[r] - x)
            final_l = l
            final_r = r

        if arr1[l] + arr2[r] > x :
            r -= 1
        elif arr1[l] + arr2[r] < x:
            l += 1


    print(arr1[final_l])
    print(arr2[final_r])




A=[1, 4, 5, 7]
B=[10, 20, 30, 40]
findtheclosestpair(A,B,50)