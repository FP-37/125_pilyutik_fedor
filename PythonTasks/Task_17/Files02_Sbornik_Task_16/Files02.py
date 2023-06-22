import datetime
import time
import csv

x = 1
spisok = []

while x <= 300:
    vremya = datetime.datetime.now()
    tippaDATA = vremya.strftime('%H:%M %d.%m.%y')
    tippaSEC = vremya.strftime('%S')
    tippaMS = vremya.strftime('%f')
    stroka = [x, tippaDATA, tippaSEC, tippaMS]
    spisok.append(stroka)
    x += 1
    time.sleep(0.01)

file = open('rows_300.csv', 'w+')
emae = csv.writer(file,delimiter=';')
emae.writerows(spisok)
file.close()

file = open('rows_300.csv','r')
emae = csv.reader(file,delimiter=';')
for row in emae:
    print(row)
file.close()