import numpy as np

N,M = list(map(int,input().split()))
arr = np.array([input().split() for _ in range(N)],dtype = 'i')
print(np.mean(arr,axis = 1))
print(np.var(arr,axis = 0))
print(round(np.std(arr,axis = None),11))
