import numpy as np

n=int(input())

print(round(np.linalg.det([[float(j) for j in input().rstrip().split()] for i in range(n)]),2))
