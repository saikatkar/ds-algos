A = [64, 25, 12, 22, 11,8,23]

for i in range(1,len(A)):

    j = i-1
    key = A[i]
    while j >= 0 and A[j] > key :
        A[j+1] = A[j]
        j -= 1
    A[j+1] = key

print(A)


