import numpy

# Inputs
n , m , p = map(int, input().split())

# Arrays
nxp = [list(map(int, input().split())) for _ in range(n)]
mxp = [list(map(int, input().split())) for _ in range(m)]

#Concatinate and print
print(numpy.concatenate((nxp, mxp), axis=0))
