import random

hihi = []
haha = []

def neYmejuVTsifri(numbs):

    x = 0

    cheeseburger = random.randint(50, 101)
    while x < cheeseburger:
        y = random.randint(0,10000)
        x+=1
        numbs.insert(x,y)

    return(numbs)

hihi = neYmejuVTsifri(hihi)
haha = neYmejuVTsifri(haha)

#Выше – функция заполнения массивов случайной длины случайными числами

def lolProhibitThat(array1,array2):

    x = 0

    while x < len(array2):
        if array1[x] in array2:
            array1.remove(array1[x])
        x = x + 1

    return array1

#Выше – функция удаления из первого массива элементов, встречающихся во втором массиве

lolProhibitThat(hihi, haha)

print(hihi, haha)