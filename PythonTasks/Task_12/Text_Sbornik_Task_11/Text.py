print("Введите как минимум 5 слов:")
stroka = str(input())

def wherefirstword(text):

    x = 0

    while text[x] == ' ':
        x +=1

    return x

def proverka(text,a):

    numb = 1

    while a < len(text):
        if text[a] == ' ':
            numb += 1
        a +=1

    if numb < 5:
        print("слов недостаточно")
    else:
        print("Всё ок, в тексте ", numb, "слов, гоним дальше.")

proverka(stroka,wherefirstword(stroka))

symbolnumb = 0
txtlist = []

def razdelenije(full,text,x):

    txtarray = []

    while x < len(text):

        if text[x] != ' ':
            txtarray.append(text[x])
            x += 1

            if x == len(text)-1:
                txtarray.append(text[x])
                haha = "".join(txtarray)
                full.append(haha)

        else:
            x += 1
            haha = "".join(txtarray)
            full.append(haha)
            return razdelenije(full,text,x)

    return full

def m1x(listformax):

    x = 1
    array = listformax

    while x < len(array):
        if len(array[0]) < len(array[x]):
            array.insert(0,array[x])
            del array[x+1]
        x += 1
    y = array[0]
    print("Самое длинное слово:")
    print(y)

def often(array):

    x = 1

    while x < len(array):
        if array.count(array[0]) < array.count(array[x]):
            array.insert(0,array[x])
        x += 1
    print("Самое повторяющееся слово:")
    print(array[0])

often(razdelenije(txtlist,stroka,symbolnumb))
m1x(razdelenije(txtlist,stroka,symbolnumb))