print("Введите текст:")
stroka = str(input()).lower()
print("Поиск по тексту:")
sbstr = str(input()).lower()

def search_substr(substr, str):

    substr = list(substr)
    str = list(str)

    a = len(substr)
    x = 0

    while x < len(str):

        if str[0+x:a+x] == substr:
            print("Есть контакт!")
            break

        if x+1 == len(str):
            print("Мимо!")
            break

        x+=1

search_substr(sbstr,stroka)