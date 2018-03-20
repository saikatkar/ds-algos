A = [64, 25, 12, 22, 11,8,23,45,36,75]


for i in range(len(A)-1):
    flag = False
    for j in range(len(A)-1-i):


        if A[j] > A[j+1]:
            A[j],A[j+1] = A[j+1],A[j]
            flag = True

    if not flag:
        break

print (A)
