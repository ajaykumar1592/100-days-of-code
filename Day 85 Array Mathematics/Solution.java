import numpy as np

# Shape
N,M = map(int,input().split())
# Input 2-D arrays A, B
A_list = []
B_list = []
for _ in range(N):
    A_list.append(list(map(int,input().split())))
A = np.array(A_list, ndmin = 2)
for _ in range(N):
    B_list.append(list(map(int,input().split())))
B = np.array(B_list, ndmin = 2)

print(A+B,A-B,A*B,A//B,A%B,A**B,sep='\n')
