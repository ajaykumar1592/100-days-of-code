T = int(input())
for i in range(T):
    n = int(input())
    cubes_ls = list(map(int, input().split()))
    pile_ls = []
    answer = True
    if n > 2:
        for i in range(1, n+1):
            if cubes_ls[-1] >= cubes_ls[0]:
                pile_ls += [cubes_ls.pop()]
            else:
                pile_ls += [cubes_ls.pop(0)]
            if i>=2:
                if pile_ls[-1] > pile_ls[-2]:
                    answer = False
                    break
        print('Yes' if answer else 'No')
    else:
        print('Yes')
