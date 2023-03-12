import random

N = random.randint(1,20)
S = []
D = []

def ZapolniMenya(array,n):

    x = 0

    while x < n:
        array.append(random.randint(0, 100))
        x+=1

    return array

def ravnovesije(array1,array2):

    numboftimes = 0
    x = 0

    while x < len(array1):
        if array1[x] == array2[x]:
            numboftimes+=1
        x+=1

    return numboftimes

print(ravnovesije(ZapolniMenya(S,N),ZapolniMenya(D,N)))