import numpy as np

N,M = list(map(int,input().split()))
arr = np.array([input().split() for _ in range(N)],dtype = 'i')
newarr = np.sum(arr, axis = 0)
print(np.prod(newarr))
