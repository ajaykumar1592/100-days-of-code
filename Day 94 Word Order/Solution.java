n = int(input())

dictV={}
lists = []
for i in range(n):
    lists.append(input())

for i in lists:
    if i in dictV:
        dictV[i]+=1
    else:
        dictV[i]=1
output = list(dictV.values())
print(len(dictV))
print(' '.join(str(i) for i in output))
