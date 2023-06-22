import random

zagadka = random.randint(1,100)

def igra(otvet):

    trynumb = 0
    guessthat = 0
    while guessthat != otvet:

        print("Какое число загадал компьютер?")
        guessthat = int(input())

        if guessthat > otvet:
            print("Предположенное Вами число больше загаданного.")
        elif guessthat < otvet:
            print("Предположенное Вами число меньше загаданного.")
        else:
            print("Число отгадано! Как зовут победителя?")
            name = str(input())
        trynumb +=1
    return fileplus(name,str(trynumb))

def fileplus(nick, num):

    stroka = ["Имя: ",nick," Количество попыток: ",num,'\n']
    haha = "".join(stroka)


    file = open("game.txt", 'a+')
    file.write(haha)
    file.close()

igra(zagadka)