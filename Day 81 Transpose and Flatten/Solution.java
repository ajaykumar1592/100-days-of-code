import numpy

# Read n, m
n, _ = map(int, input().split())

# Read Array
array = [list(map(int, input().split())) for _ in range(n)]

# Opperations
print(numpy.transpose(array))
print(numpy.array(array).flatten())
