A = [2,4,1,5,1,8,2,5,4,9]

def pigeonholesort(A):

    min_no = min(A)
    max_no = max(A)

    size = max_no - min_no + 1

    hole = [[] for _ in range(size)]



    for i in range(len(A)):

        hole[ A[i] - min_no].append(A[i])

    k = 0
    for i in range(len(hole)):
        if len(hole[i]) > 0:
            for j in range(len(hole[i])):
                A[k] = hole[i][j]
                k += 1


pigeonholesort(A)
print(A)



