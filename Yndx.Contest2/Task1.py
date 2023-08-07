"""
К Новому-преновому году работники Тындекса построили N ледяных скульптур, i-я скульптура состоит из a i-тых килограмм льда.
Но они не посоветовались с Кузей! А ведь Кузя знает, что идеальная скульптура состоит из ровно X килограмм льда, не больше и не меньше.
Новый-преновый год уже совсем скоро, до него осталось всего T минут.
За одну минуту Кузя может выбрать одну скульптуру и добавить или удалить ровно 1 килограмм льда из неё. Вас, как отличника художественной школы,
Кузя просит найти максимальное количество идеальных скульптур в момент наступления праздника.
"""

info = str(input())
N = []
X = []
T = []
flagN = True
flagX = False
flagT = False
for i in info:
    if flagN:
        if i != " ":
            N.append(i)
        else:
            flagN = False
            flagX = True
    elif flagX:
        if i != " ":
            X.append(i)
        else:
            flagX = False
    else:
        T.append(i)
N = int("".join(N))
X = int("".join(X))
T = int("".join(T))
massa = str(input())
onenumb = []
numbs = []
for that in massa:
    if that != " ":
        onenumb.append(that)
    else:
        numbs.append(int("".join(onenumb)))
        onenumb.clear()
numbs.append(int("".join(onenumb)))
i = 0
K = 0
difference = []
for one in numbs:
    difference.append(abs(X-one))
difference = sorted(difference)
for one in difference:
    if T == 0:
        break
    while one != 0:
        if T != 0:
            one -= 1
            T -= 1
        else:
            break
    if one == 0:
        K += 1
print(K)
figures = []
i = 1
y = 0
while y != K:
    for one in numbs:
        if y == K:
            break
        dif = abs(one-X)
        if dif == difference[y]:
            figures.append(i)
            y += 1
        i += 1
        if i == len(numbs)+1:
            i = 1
figures = sorted(figures)
answer = ''
schyot = 0
for one in figures:
    answer += str(one)
    schyot += 1
    if schyot != len(figures):
        answer += ' '
print(answer)