A = [75, 11, 12, 22, 23, 25, 36, 45, 64, 8]

def combsort(arr):
    gap = len(arr)
    swapped = True
    while gap != 1 or swapped == True:

        i = 0
        swapped = False
        while i+gap < len(arr):

            if arr[i] > arr[i+gap]:

                arr[i+gap],arr[i] = arr[i],arr[i+gap]
                swapped = True
            i += 1

        gap = int(gap/1.3)
        if(gap < 1):
            gap = 1

combsort(A)

print(A)
