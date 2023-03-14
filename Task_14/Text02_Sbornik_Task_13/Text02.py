def schetchik(text):

    a = 0

    numb = 1

    while a < len(text):
        if text[a] == ' ':
            numb += 1
        a +=1

    print("Количество слов: ", numb)

def oshibki():

    print("Введите текст (до 800 символов без пробелов в начале и в конце):")
    text = str(input())

    zaglavnije = sum(map(str.isupper,text))

    if zaglavnije > 0:
        print ("Только строчные буквы! Срочно!")
        return oshibki()

    if text[0] == ' ':
        print("Никаких пробелов перед текстом пока не доешь суп!")
        return oshibki()

    if text[len(text)-1] == ' ':
        print("А нормальный текст без пробелов в конце не хочешь написать?")
        return oshibki()

    i = 0

    while i < len(text)-1:
        if(text[i] == text[i+1]) and (text[i] == ' '):
            print("Двойные прбелы – это не шутки. Давай по новой, но без них.")
            return oshibki()
        i += 1

    if len(text) > 800:
        print("Ну договорились же, что не больше 800 символов.")
        return oshibki()
    return text

stroka = oshibki()
schetchik(stroka)