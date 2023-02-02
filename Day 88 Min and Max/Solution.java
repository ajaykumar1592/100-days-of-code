import numpy

n, _ = map(int, input().split())

array = [list( map(int, input().split())) for _ in range(n)]

print(numpy.max(numpy.min(numpy.array(array), axis=1), axis=0))
