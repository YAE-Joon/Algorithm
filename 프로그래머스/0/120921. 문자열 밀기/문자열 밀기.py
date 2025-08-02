def solution(A, B):
    answer = -1
    for i in range(len(A)):
        if A==B:
            answer = i
            break
        A = push(A)
    
    return answer

def push(A):
    A = A[-1]+A[:-1]
    return A