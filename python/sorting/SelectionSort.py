
A = [64, 25, 12, 22, 11,8,23]

for i in range(len(A)):
    min = A[i]
    minIdx = i
    for j in range(i+1,len(A)):
        if A[j] < A[minIdx]:
            minIdx=j

    A[i],A[minIdx] = A[minIdx],A[i]

print("Sorted array")
print(A)
for i in A:
    print ( i ,end=' ')


