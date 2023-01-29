import numpy
numpy.set_printoptions(legacy='1.13')

# Read n, m
shape = tuple(map(int, input().split()))

# Print
print(numpy.eye(*shape))
