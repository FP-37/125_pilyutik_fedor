import random

a = random.randint(0, 300)
b = random.randint(0, 300)

start = min(a, b)
end = max(a, b)

print(start,end)

def sum_range(s, e):

    array = []

    for i in range(s,e+1):
        array.append(i)

    print(sum(array))

sum_range(start,end)