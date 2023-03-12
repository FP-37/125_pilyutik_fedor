import random

cost = random.randint(10,20)
print("Цена подписки сегодня: ",cost,"$")

def manymoney():

    print("Сколько $ у Алисы?")
    A = int(input())
    print(A)

    print("Сколько $ у Боба?")
    B = int(input())
    print(B)

    print("Сколько $ у Чарли?")
    C = int(input())
    print(C)

    return [A,B,C]

def enough(c0st):

    dengi = manymoney()

    if sum(dengi)>c0st:
        return dengi
    else:
        print("Денег недостаточно:(")
        return enough(c0st)

def whichone(l1st):

    A = l1st[0]
    B = l1st[1]
    C = l1st[2]

    l1st.remove(min(l1st))

    if A in l1st:
        print("Алиса")
    if B in l1st:
        print("Боб")
    if C in l1st:
        print("Чарли")

pole = enough(cost)

if (pole[0] == pole[1]) & (pole[1] == pole[2]):
    print("Любая пара может купить подписку.")
    exit(0)

whichone(pole)