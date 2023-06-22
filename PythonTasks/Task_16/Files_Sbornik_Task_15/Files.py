import os

whichdirectory = str(input()) #сюда кладём адрес любой папки

def print_docs(directory):

    stroka = os.walk(directory)
    for roots, dirs, files in stroka:
        print(dirs)
        print(files)

print_docs(whichdirectory)