arr = []
flag = True
maximum = 0

while flag:
    x = input()
    if x == "10000":
        arr.append(x)
    elif len(x) >= len("10000") or x == "exit":
        flag = False
    else:
        arr.append(x)

for row in arr:
    numb = 0
    for char in row:
        if char == "1":
            numb += 1
            if numb > maximum:
                maximum = numb
        else:
            numb = 0

print(maximum)

"""
Требуется найти в бинарном векторе самую длинную последовательность единиц и вывести её длину.

Желательно получить решение, работающее за линейное время и при этом проходящее по входному массиву только один раз.
"""