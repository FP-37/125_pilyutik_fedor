friends = ("Мавпродош", "Лорнектиф", "Древерол", "Фиригарпиг", "Клодобродыч")

def proverka(nick):

    if nick in friends:

        print("Ты – свой. Приветствую тебя, любезный {0}".format(nick))

    else:

        print("Тут ничего нет. Ещё есть вопросы?")


print("Введите Ваш ник:")
nickname = str(input())
proverka(nickname)